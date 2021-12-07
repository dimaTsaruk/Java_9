package Baha_classes.Collections;

import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {
        // create a Set from existing List
        List<Integer> listNumbers = Arrays.asList(3, 5, 6, 2, 3, 1, 0, 9, 8);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);
    }
}
