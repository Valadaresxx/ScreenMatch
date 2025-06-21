package br.com.valadares.screenmatch.exceptions;

public class ErrorFormatYear extends RuntimeException {
    private String message;

    public ErrorFormatYear(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
