package ru.atikhomirov.example.collections;

import java.util.Objects;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Human h = (Human) obj;
        return name == h.name;
    }
}
