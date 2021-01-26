package ru.job4j;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for ( ; start <= finish; start++) {
            if (data[start] == el) {
                rst = start;
                break;
            }
        }
        return rst;
    }
}
