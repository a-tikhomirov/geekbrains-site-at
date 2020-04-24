package ru.atikhomirov.example.collections.map;

import ru.atikhomirov.example.collections.Dog;
import ru.atikhomirov.example.collections.Human;

import java.util.HashMap;

public class SizeExample {
    public static void main(String[] args) {
        HashMap<Human, Dog> mapDogs = new HashMap<>();
        System.out.println(mapDogs.isEmpty());

        mapDogs.put(new Human("Иван"), new Dog("Белка"));
        mapDogs.put(new Human("Петр"), new Dog("Стрелка"));

        System.out.println(mapDogs);
        System.out.println(mapDogs.size());
        System.out.println(mapDogs.isEmpty());
    }
}
