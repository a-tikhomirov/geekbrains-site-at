package ru.atikhomirov.example.collections.map;

import ru.atikhomirov.example.collections.Dog;
import ru.atikhomirov.example.collections.Human;

import java.util.HashMap;

public class RemoveExample {
    public static void main(String[] args) {
        HashMap<Human, Dog> mapDogs = new HashMap<>();

        mapDogs.put(new Human("Иван"), new Dog("Белка"));
        mapDogs.put(new Human("Петр"), new Dog("Стрелка"));

        System.out.println(mapDogs);
        mapDogs.remove(new Human("Петр"));
        System.out.println(mapDogs);
        mapDogs.clear();
        System.out.println(mapDogs);
    }
}
