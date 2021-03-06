package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter go = new Counter();
        int result = go.add(0, 10);
        assertThat(result, is(30));
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.

    }
    @Test
    public void whenSumEvenNumbersFromNineToTenThenTen() {
        Counter go = new Counter();
        int result = go.add(9, 10);
        assertThat(result, is(10));
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.

    }
}
