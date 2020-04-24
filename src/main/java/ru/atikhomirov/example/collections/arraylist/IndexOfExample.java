package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;

public class IndexOfExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));

        System.out.println(dogs.indexOf(new Dog("Стрелка")));
    }
}
