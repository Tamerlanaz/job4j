package ru.job4j.loop;

/**
 * @author Timur Hamidullin (mailto:tamerlanaz@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    /**
     * Определение факториала.
     * @param n заданное число.
     * @return факториал заданного числа.
     */

    public int calc(int n) {
        int m;
        int fact = 1;

        for (m = 1; m <= n; m++){
            fact = fact * m;
        }
    return fact;
    }
}
