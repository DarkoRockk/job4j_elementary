package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Machine;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class MachineTest {
    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = Machine.change(100, 100);
        Assert.assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void when50by35() {
        int[] expected = {10, 5};
        int[] rsl = Machine.change(50, 35);
        Assert.assertThat(rsl, Matchers.is(expected));
    }
}