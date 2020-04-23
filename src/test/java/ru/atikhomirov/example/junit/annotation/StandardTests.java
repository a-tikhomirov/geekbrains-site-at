package ru.atikhomirov.example.junit.annotation;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StandardTests extends BaseTest {

    @BeforeAll
    static void initAll() {
        System.out.println("initAll");
    }

    @BeforeEach
    void init() {
        System.out.println("init");
    }

    @Test
    void succeedingTest1() {
        System.out.println("succeedingTest");
    }

    @Test
    void succeedingTest2() {
        System.out.println("succeedingTest");
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

//    @Test
//    void failingTest() {
//        fail("a failing test");
//    }
//
//    @Test
//    @Disabled("for demonstration purposes")
//    void skippedTest() {
//    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll");
    }
}
