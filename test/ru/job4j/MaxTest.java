package ru.job4j;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

}