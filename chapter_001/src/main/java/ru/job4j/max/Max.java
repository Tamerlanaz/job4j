package ru.job4j.max;

/**
 * Программа возвращает наибольшее из двуч чисел
 */
public class Max {

    /**
     * Определение наибольшего числа.
     * @param first первое число.
     * @param second второе число.
     * @return наибольшее из двух чисел.
     */

    public int max(int first, int second) {
        return (first > second)? first : second;
    }
}
