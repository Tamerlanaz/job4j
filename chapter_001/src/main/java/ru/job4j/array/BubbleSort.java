package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        return array;
    }
}
