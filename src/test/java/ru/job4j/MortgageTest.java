package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Mortgage;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class MortgageTest {
    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 1);
        Assert.assertThat(year, Matchers.is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 120, 50);
        Assert.assertThat(year, Matchers.is(2));
    }

}