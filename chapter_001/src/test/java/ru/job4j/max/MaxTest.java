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
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(12, 9);
        assertThat(result, is(12));
    }
    @Test
    public void whenSecondEqualyFirst() {
        Max maxim = new Max();
        int result = maxim.max(10, 10);
        assertThat(result, is(10));
    }
}
