package ru.atikhomirov.example.collections.map;

import ru.atikhomirov.example.collections.Dog;
import ru.atikhomirov.example.collections.Human;

import java.util.HashMap;

public class EqualsExample {
    public static void main(String[] args) {
        HashMap<Human, Dog> mapDogs = new HashMap<>();

        mapDogs.put(new Human("Иван"), new Dog("Белка"));
        mapDogs.put(new Human("Петр"), new Dog("Стрелка"));

        HashMap<Human, Dog> mapDogs2 = new HashMap<>();
        mapDogs2.putAll(mapDogs);

        System.out.println(mapDogs.equals(mapDogs2));
    }
}
