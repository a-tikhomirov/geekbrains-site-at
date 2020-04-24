package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));
        dogs.add(new Dog("Барбос"));

        Object[] oArr = dogs.toArray();
        System.out.println(Arrays.toString(oArr));
    }
}
