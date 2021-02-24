package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.MinDiapason;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        Assert.assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                Is.is(0)
        );
    }

    @Test
    public void whenLastMin() {
        Assert.assertThat(
                MinDiapason.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                Is.is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        Assert.assertThat(
                MinDiapason.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                Is.is(2)
        );
    }
}