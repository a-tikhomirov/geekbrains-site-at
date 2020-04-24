package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));
        dogs.add(new Dog("Барбос"));
        dogs.add(new Dog("Стрелка"));

        System.out.println(dogs);
        System.out.println(Collections.frequency(dogs, new Dog("Стрелка")));
    }
}
