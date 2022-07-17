package com.example.homework18_3;

public class Distance {
    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void print(double convertedDistance) {
        System.out.println(convertedDistance);
    }
    static class Converter {
        public double convertFromKilometersToMeters(double distance) {
            return distance * 1000;
        }

        public double convertFromMetersToKilometers(double distance) {
            return distance / 1000;
        }

        public double convertFromMilesToKilometers(double distance) {
            return distance / 1.6;
        }
        public double convertFromKilometersToMiles(double distance) {
            return distance * 1.6;
        }
    }
}
