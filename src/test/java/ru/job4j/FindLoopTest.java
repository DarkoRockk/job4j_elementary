package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.FindLoop;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        Assert.assertThat(result, Is.is(expect));
    }
    @Test
    public void whenArrayHas4Then1() {
        int[] input = {5, 4, 3, 2};
        int value = 4;
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        Assert.assertThat(result, Is.is(expect));
    }
    @Test
    public void whenArrayHas6ThenNotFind() {
        int[] input = {5, 4, 3, 2};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        Assert.assertThat(result, Is.is(expect));
    }
    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        Assert.assertThat(result, Is.is(expect));
    }
    @Test
    public void whenFind4() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 4;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        Assert.assertThat(result, Is.is(expect));
    }
    @Test
    public void whenNotFind() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 33;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        Assert.assertThat(result, Is.is(expect));
    }
}