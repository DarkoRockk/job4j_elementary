package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.PrimeNumber;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;


public class PrimeNumberTest {

    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        Assert.assertThat(count, Matchers.is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        Assert.assertThat(count, Matchers.is(5));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        Assert.assertThat(count, Matchers.is(1));
    }

}