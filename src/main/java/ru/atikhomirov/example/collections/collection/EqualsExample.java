package ru.atikhomirov.example.collections.collection;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.Collection;

public class EqualsExample {
    public static void main(String[] args) {
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        Collection<Dog> dogs2 = new ArrayList<>();
        dogs2.addAll(dogs);

        System.out.println(dogs.equals(dogs2));

        dogs2.add(new Dog("Белка"));
        System.out.println(dogs.equals(dogs2));
    }
}
