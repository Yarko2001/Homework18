package com.example.alishevLessons.alishev_33;

import java.util.ArrayList;
import java.util.List;

public class Alishev33 {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        String animal = (String) animals.get(1);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<>();
        animals2.add("horse");
        animals2.add("tiger");
        animals2.add("bear");
        String animal2 = animals2.get(1);
        System.out.println(animal2);
    }
}
