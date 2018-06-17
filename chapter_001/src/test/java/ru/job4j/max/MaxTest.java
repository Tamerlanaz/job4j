package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Timur Khamidullin (mailto:tamerlanaz@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void  whenFirstLessSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondLessFirstLessThird() {
        Max maxim = new Max();
        int result = maxim.max(12, 9, 10);
        assertThat(result, is(12));
    }
    @Test
    public void whenFirstLessThirdLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(12, 29, 5);
        assertThat(result, is(29));
    }
    @Test
    public void whenSecondEqualyFirstEqualyThird() {
        Max maxim = new Max();
        int result = maxim.max(10, 10, 10);
        assertThat(result, is(10));
    }
}
