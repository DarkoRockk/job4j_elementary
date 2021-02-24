package ru.job4j;

import main.java.ru.job4j.ChessBoard;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        Assert.assertThat(way, Is.is(5));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        Assert.assertThat(way, Is.is(7));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 6, 4, 1);
        Assert.assertThat(way, Is.is(0));
    }
}