package chapter_9;

import java.util.*;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] scores = new int[7];
        display("Original array", scores);
        Arrays.fill(scores, 19);
        display("After filling with number 19   ", scores);
        scores[2] = 8;
        scores[4] = 22;
        display("After changing two values:     ", scores);
        Arrays.sort(scores);
        display("After sorting:     ", scores);
    }

    public static void display(String message, int array[]) {
        int size = array.length;
        System.out.println(message);
        for (int x = 0; x < size; x++)
            System.out.print(array[x] + " ");
        System.out.println();
    }
}
