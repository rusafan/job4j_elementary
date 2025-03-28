package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 0;
        if (number == 0 || number == 1)  {
            result = 1;
        }
        if (number > 1) {
            result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }
}