package ru.atikhomirov.example.collections.collection;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.Collection;

public class AddExample {
    public static void main(String[] args) {
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        Collection<Dog> dogs2 = new ArrayList<>();
        dogs2.add(new Dog("Белка"));
        dogs2.add(new Dog("Стрелка"));

        dogs.addAll(dogs2);
        System.out.println(dogs);
    }
}
