package ru.job4j;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static main.java.ru.job4j.EqLast.check;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        Assert.assertThat(check(left, right), Matchers.is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        Assert.assertThat(check(left, right), Matchers.is(false));
    }
}