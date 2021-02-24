package ru.job4j;

import main.java.ru.job4j.CheckPrimeNumber;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        Assert.assertThat(rsl, Matchers.is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        Assert.assertThat(rsl, Matchers.is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        Assert.assertThat(rsl, Matchers.is(false));
    }
}