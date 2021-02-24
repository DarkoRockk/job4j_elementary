package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.ArrayChar;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertThat(result, Is.is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result =ArrayChar.startsWith(word, pref);
        Assert.assertThat(result, Is.is(false));
    }
}