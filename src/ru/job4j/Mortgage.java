package ru.job4j;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            year++;
            amount = amount + amount * (percent / 100);
            amount = amount - salary;
        }
        return year;
    }
}
