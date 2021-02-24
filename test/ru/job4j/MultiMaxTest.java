package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenAllAreSame() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}