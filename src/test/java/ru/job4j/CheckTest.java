package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Check;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        Assert.assertThat(result, Is.is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        Assert.assertThat(result, Is.is(false));
    }
}