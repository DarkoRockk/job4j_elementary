package main.java.ru.job4j;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        while (diff > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (diff - coins[i] >= 0) {
                    rsl[size] = coins[i];
                    diff -= coins[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
