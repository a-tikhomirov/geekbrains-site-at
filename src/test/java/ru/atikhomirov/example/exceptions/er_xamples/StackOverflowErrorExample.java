package ru.atikhomirov.example.exceptions.er_xamples;

public class StackOverflowErrorExample {

    public static void main(String[] args) {
        example();
    }

    public static void example(){
        example();
    }
}
