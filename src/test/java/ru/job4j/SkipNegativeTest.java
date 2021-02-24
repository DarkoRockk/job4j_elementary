package ru.job4j;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import main.java.ru.job4j.SkipNegative;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class SkipNegativeTest {
    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        Assert.assertThat(rsl, Matchers.is(expect));
    }

}