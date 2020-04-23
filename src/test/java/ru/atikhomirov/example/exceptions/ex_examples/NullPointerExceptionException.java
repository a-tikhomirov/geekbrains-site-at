package ru.atikhomirov.example.exceptions.ex_examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class NullPointerExceptionException {

    WebDriver webDriver;

    @Test
    void name() {
        webDriver.get("https://google.com");
    }
}
