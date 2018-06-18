package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial go = new Factorial();
        int result = go.calc(5);
        assertThat(result, is(120));
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial go = new Factorial();
        int result = go.calc(0);
        assertThat(result, is(1));
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}