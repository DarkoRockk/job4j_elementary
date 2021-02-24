package ru.job4j;

import main.java.ru.job4j.MultiMax;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        Assert.assertThat(result, Is.is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(4, 1, 2);
        Assert.assertThat(result, Is.is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 4);
        Assert.assertThat(result, Is.is(4));
    }

    @Test
    public void whenAllAreSame() {
        int result = MultiMax.max(4, 4, 4);
        Assert.assertThat(result, Is.is(4));
    }
}