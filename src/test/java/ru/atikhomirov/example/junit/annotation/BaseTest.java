package ru.atikhomirov.example.junit.annotation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class BaseTest {

    @BeforeAll
    static void initAllBaseTests() {
        System.out.println("BaseTests initAll");
    }

    @BeforeEach
    void initBaseTests() {
        System.out.println("BaseTests init");
    }

    @AfterEach
    void tearDownBaseTests() {
        System.out.println("BaseTests tearDown");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("BaseTests tearDownAll");
    }
}
