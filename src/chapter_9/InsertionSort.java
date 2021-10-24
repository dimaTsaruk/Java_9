package chapter_9;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 1, 9, 8};

        for (int i = 1; i < array.length; i++) {
            int current = array[i]; //
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        for (int x : array)
            System.out.print(x + " ");
    }
}

