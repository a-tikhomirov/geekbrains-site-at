package ru.atikhomirov.example.exceptions.ex_examples;

import org.junit.jupiter.api.Test;

public class ClassCastExceptionException {
    @Test
    void name() {
        Object integer = new Integer(5);




        System.out.println((String) integer);
    }
}
