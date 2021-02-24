package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Fitness;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        Assert.assertThat(month, Matchers.is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        Assert.assertThat(month, Matchers.is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        Assert.assertThat(month, Matchers.is(2));
    }
    @Test
    public void whenIvanSameNik() {
        int month = Fitness.calc(90, 90);
        Assert.assertThat(month, Matchers.is(1));
    }

}