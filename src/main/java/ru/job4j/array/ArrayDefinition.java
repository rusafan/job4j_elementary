package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Artem";
        names[1] = "Vova";
        names[2] = "Dima";
        names[3] = "Elena";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[3]);
        System.out.println(names[2]);
        System.out.println(names[1]);
        System.out.println(names[0]);
    }
}
