package ru.job4j;

import static org.junit.Assert.*;

import main.java.ru.job4j.Matrix;
import main.java.ru.job4j.MatrixCheck;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MatrixTest {
    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        Assert.assertThat(table, Is.is(expect));
    }
    @Test
    public void when3on3() {
        int[][] table = Matrix.multiple(3);
        int[][] expect = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        Assert.assertThat(table, Is.is(expect));
    }
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        Assert.assertThat(result, Is.is(expect));
    }
}