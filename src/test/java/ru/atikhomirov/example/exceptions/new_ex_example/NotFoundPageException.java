package ru.atikhomirov.example.exceptions.new_ex_example;

public class NotFoundPageException extends RuntimeException {
    public NotFoundPageException() {
    }

    public NotFoundPageException(String message) {
        super(message);
    }
}
