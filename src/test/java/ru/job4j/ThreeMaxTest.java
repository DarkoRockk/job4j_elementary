package ru.job4j;

import main.java.ru.job4j.ThreeMax;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10, 5, 1);
        Assert.assertThat(rsl, Matchers.is(10));
    }

    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(10, 50, 1);
        Assert.assertThat(rsl, Matchers.is(50));
    }

    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(1, 5, 100) ;
        Assert.assertThat(rsl, Matchers.is(100));
    }

    @Test
    public void allEq() {
        int rsl = ThreeMax.max(1, 1, 1);
        Assert.assertThat(rsl, Matchers.is(1));
    }

    @Test
    public void firstEqSecond() {
        int rsl = ThreeMax.max(10, 10, 1);
        Assert.assertThat(rsl, Matchers.is(10));
    }

    @Test
    public void firstEqThird() {
        int rsl = ThreeMax.max(100, 1, 100);
        Assert.assertThat(rsl, Matchers.is(100));
    }

    @Test
    public void secondEqThird() {
        int rsl = ThreeMax.max(1, 100, 100);
        Assert.assertThat(rsl, Matchers.is(100));
    }

}