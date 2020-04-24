package ru.atikhomirov.example.collections.collection;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ToArrayExample {
    public static void main(String[] args) {
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        Object[] dogsArr = dogs.toArray();
        System.out.println(Arrays.toString(dogsArr));
    }
}
