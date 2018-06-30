package ru.job4j.loop;

/**
 * @author Timur Hamidullin (mailto:tamerlanaz@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    /**
     * Определение определение суммы четных чисел.
     * @param start первое число.
     * @param finish последнее число.
     * @return сумма четных чисел в промежутке.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
