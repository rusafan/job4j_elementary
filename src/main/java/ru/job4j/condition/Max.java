package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        return max(max(left, right), middle);
    }

    public static int max(int left, int right, int middle, int next) {
        return max(max(max(left, right), middle), next);
    }

    public static void main(String[] args) {
        int result = Max.max(-5, 3);
        System.out.println(result);
    }
}