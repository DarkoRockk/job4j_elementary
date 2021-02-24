package ru.job4j;

import main.java.ru.job4j.SqArea;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void when62then2() {
        double expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when184then4() {
        double expected = 4;
        int p = 18;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}