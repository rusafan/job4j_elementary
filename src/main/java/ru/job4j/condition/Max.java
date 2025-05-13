package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        int result = left > right ? left : right;
        return max(result, middle);
    }

    public static int max(int left, int right, int middle, int next) {
        int result = left > right ? left : right;
        return max(result, middle, next);
    }

    public static void main(String[] args) {
        int result = Max.max(-5, 3);
        System.out.println(result);
    }
}