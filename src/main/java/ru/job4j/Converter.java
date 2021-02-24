package main.java.ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int euroExpected = 2;
        int dollarExpected = 2;
        int euroOut = Converter.rubleToEuro(in);
        int dollarOut = Converter.rubleToDollar(in);
        boolean euroPassed = euroOut == euroExpected;
        boolean dollarPassed = dollarOut == dollarExpected;
        System.out.println("140 rubles are 2 euro. Test result: " + euroPassed);
        System.out.println("140 rubles are 2 dollars. Test result: " + dollarPassed);
    }
}
