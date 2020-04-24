package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));
        dogs.add(new Dog("Барбос"));

        System.out.println(dogs);
        dogs.remove(0);
        System.out.println(dogs);
        dogs.remove(new Dog("Барбос"));
        System.out.println(dogs);
        dogs.clear();
        System.out.println(dogs);
    }
}
