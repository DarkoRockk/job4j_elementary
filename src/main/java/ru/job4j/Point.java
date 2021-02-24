package main.java.ru.job4j;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 8, 2, 5);
        System.out.println("result (3, 8) to (2, 5) " + result);
    }
}
