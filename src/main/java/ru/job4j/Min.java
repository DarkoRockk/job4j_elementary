package main.java.ru.job4j;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
           if (array[index] < min) {
               min = array[index];
           }
        }
        return min;
    }
}
