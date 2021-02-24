package ru.job4j;

import main.java.ru.job4j.Counter;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        Assert.assertThat(rsl, Matchers.is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromThreeToFiveThenFour() {
        int rsl = Counter.sumByEven(3, 5);
        int expected = 4;
        Assert.assertThat(rsl, Matchers.is(expected));
    }
}