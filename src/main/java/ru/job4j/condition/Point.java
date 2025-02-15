package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (x1, y1) to (x2, y2) " + result);
        result = Point.distance(1, 0, 4, 4);
        System.out.println("result (x1, y1) to (x2, y2) " + result);
    }
}