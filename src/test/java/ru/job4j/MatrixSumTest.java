package ru.job4j;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import main.java.ru.job4j.MatrixSum;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] in = {
                {10}
        };
        int expect = 10;
        int rsl = MatrixSum.sum(in);
        Assert.assertThat(rsl, Matchers.is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] in = {
                {1, 2},
                {1, 2}
        };
        int expect = 6;
        int rsl = MatrixSum.sum(in);
        Assert.assertThat(rsl, Matchers.is(expect));
    }

    @Test
    public void whenThree() {
        int[][] in = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expect = 7;
        int rsl = MatrixSum.sum(in);
        Assert.assertThat(rsl, Matchers.is(expect));
    }

}