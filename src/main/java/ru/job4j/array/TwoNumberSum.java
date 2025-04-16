package ru.job4j.array;
/*
public class TwoNumberSum {

        public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
 */
public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            }
            if (j < array.length - 1) {
                j++;
            } else {
                i++;
                j = i + 1;
            }
        }
        return new int[0];
    }
}
