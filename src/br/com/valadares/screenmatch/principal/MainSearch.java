package br.com.valadares.screenmatch.principal;

import br.com.valadares.screenmatch.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual filme quer buscar? ");
        var search = s.nextLine();
        String path = "http://www.omdbapi.com/?t=" + search + "&apikey=be7fcb8b";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Title myTitle = gson.fromJson(json, Title.class);
        System.out.println(myTitle);

    }
}
