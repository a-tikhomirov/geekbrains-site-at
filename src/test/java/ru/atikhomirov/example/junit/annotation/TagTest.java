package ru.atikhomirov.example.junit.annotation;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("regress")
public class TagTest {
    @Tag("smoke")
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Tag("extra")
    @Test
    void mySecondTest() {
        assertEquals(2, 1 + 2);
    }

    @Tag("blocked")
    @Test
    void myThirdTest() {
        assertEquals(2, 1 + 2);
    }
}

/*
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.22.1</version>
    <configuration>
        <includes>
            <include>...</include>
        </includes>
        <groups>regress | smoke</groups>
        <excludedGroups>extra, blocked</excludedGroups>
    </configuration>
</plugin>
*/