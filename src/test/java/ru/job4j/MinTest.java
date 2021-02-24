package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Min;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MinTest {
    @Test
    public void whenFirstMin() {
        Assert.assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                Is.is(0)
        );
    }

    @Test
    public void whenLastMin() {
        Assert.assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                Is.is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        Assert.assertThat(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                Is.is(2)
        );
    }
}