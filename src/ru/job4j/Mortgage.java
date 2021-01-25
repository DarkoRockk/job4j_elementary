package ru.job4j;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (true) {
            year++;
            amount = amount + amount * (percent / 100);
            if (salary > amount) {
                break;
            } else {
                amount = amount - salary;
            }
        }
        return year;
    }
}
