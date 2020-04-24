package ru.atikhomirov.example.collections.map;

import ru.atikhomirov.example.collections.Dog;
import ru.atikhomirov.example.collections.Human;

import java.util.HashMap;

public class AddExample {
    public static void main(String[] args) {
        HashMap<Human, Dog> mapDogs = new HashMap<>();

        mapDogs.put(new Human("Иван"), new Dog("Белка"));
        mapDogs.put(new Human("Петр"), new Dog("Стрелка"));

        HashMap<Human, Dog> mapDogs2 = new HashMap<>();
        mapDogs2.put(new Human("Афанасий"), new Dog("Барбос"));

        System.out.println(mapDogs);
        mapDogs.putAll(mapDogs2);
        System.out.println(mapDogs);
    }
}
