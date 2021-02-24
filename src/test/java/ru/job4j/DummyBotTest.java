package ru.job4j;

import main.java.ru.job4j.DummyBot;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        Assert.assertThat(
                DummyBot.answer("Привет, Бот."),
                Matchers.is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        Assert.assertThat(
                DummyBot.answer("Пока."),
                Matchers.is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        Assert.assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                Matchers.is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}