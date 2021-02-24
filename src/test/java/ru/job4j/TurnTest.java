package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Turn;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        Assert.assertThat(result, Matchers.is(expect));
    }
    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 5};
        int[] result = Turn.back(input);
        int[] expect = new int[] {5, 2, 6, 1, 4};
        Assert.assertThat(result, Matchers.is(expect));
    }

}