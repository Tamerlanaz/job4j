package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 6}.
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 9, 7, 8, 0, 6};
        int[] result = sorter.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, Matchers.is(expect));
    }
}
