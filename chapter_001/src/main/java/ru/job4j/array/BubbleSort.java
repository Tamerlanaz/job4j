package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        for (int a = 1; a <= array.length; a++) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int i = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = i;
                }
            }
        }
        return array;
    }
}
