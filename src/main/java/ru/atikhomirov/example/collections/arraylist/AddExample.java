package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.List;

public class AddExample {
    public static void main(String[] args) throws Exception {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        System.out.println(dogs.get(2));
        System.out.println();

        dogs.add(2, new Dog("Белка"));
        System.out.println(dogs);
    }
}
