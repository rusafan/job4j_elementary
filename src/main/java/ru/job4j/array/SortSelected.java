package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int idx = 0; idx < data.length; idx++) {
            int min = MinDiapason.findMin(data, idx, data.length - 1);
            int index = FindLoop.indexInRange(data, min, idx, data.length - 1);
            SwitchArray.swap(data, idx, index);
        }
        return data;
    }
}