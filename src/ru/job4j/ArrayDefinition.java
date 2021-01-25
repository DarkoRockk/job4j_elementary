package ru.job4j;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер ages: " + ages.length);
        System.out.println("Размер surnames: " + surnames.length);
        System.out.println("Размер prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Иван Иванов";
        names[1] = "Петр Петров";
        names[2] = "Дмитрий Шадрин";
        names[3] = "Гомер Симпсон";

        for (int i = 0; i < names.length; i++) {
            System.out.println("name[" + i + "] = " + names[i]);
        }
    }
}
