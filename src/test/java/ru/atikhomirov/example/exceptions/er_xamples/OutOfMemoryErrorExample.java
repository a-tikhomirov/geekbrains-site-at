package ru.atikhomirov.example.exceptions.er_xamples;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

   static List<Object[]> aaaa = new ArrayList<>();

    public static void main(String[] args) {
        while (true){
            System.out.println("!");
            aaaa.add(new Object[1000000]);
        }
    }
}
