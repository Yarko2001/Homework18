package com.example.homework18_4;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Wheel wheel = vehicle.new Wheel();
        Vehicle.Door door = vehicle.new Door();

        vehicle.print();
        wheel.print();
        door.print();
    }
}
