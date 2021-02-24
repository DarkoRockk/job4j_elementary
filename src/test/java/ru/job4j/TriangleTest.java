package ru.job4j;

import main.java.ru.job4j.Triangle;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertThat(result, Is.is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(2.0, 2.0, 7.0);
        Assert.assertThat(result, Is.is(false));
    }
}