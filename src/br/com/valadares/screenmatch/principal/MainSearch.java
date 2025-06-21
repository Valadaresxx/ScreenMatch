package br.com.valadares.screenmatch.principal;

import br.com.valadares.screenmatch.exceptions.ErrorFormatYear;
import br.com.valadares.screenmatch.models.Title;
import br.com.valadares.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        String search = "";
        List<Title> list = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("Sai")) {
            System.out.println("Qual filme quer buscar? ");
            search = s.nextLine();
            String path = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=be7fcb8b";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(path))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println(myTitle);

                list.add(myTitle);


            } catch (NumberFormatException e) {
                System.out.println("Error " + e.getMessage());
            } catch (ErrorFormatYear e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(list);
        FileWriter writer = new FileWriter("Filmes.json");
        writer.write(gson.toJson(list));
        writer.close();

    }
}
