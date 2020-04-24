package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;

public class SetExample {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));
        dogs.add(new Dog("Барбос"));

        System.out.println(dogs);
        dogs.set(2, new Dog("Балбес"));
        System.out.println(dogs);
    }
}
