package com.example.homework18_3;

public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(1000);

        Distance.Converter converter = new Distance.Converter();

        distance.print(converter.convertFromKilometersToMiles(distance.getDistance()));
    }
}
