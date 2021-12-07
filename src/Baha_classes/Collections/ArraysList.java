package Baha_classes.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArraysList<S> {

    /**
     * write a method that takes an arraylist of string objects and returns ArraysList of objects
     * by adding "+" to end of each element.
     * NOTE: You can use the same arrayList or create a new arrayList to return
     * EX: these are the list items = {"alpha", "beta", "gamma"}
     * expected output: {"alpha+", "beta+", "gamma+"}
     */
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma"));
        int indexGamma = wordsList.indexOf("Gamma");
        String gammaPlus = wordsList.get(indexGamma).concat("+");

        wordsList.set(indexGamma, gammaPlus);
        System.out.println("Initial List: " + wordsList);
        System.out.println("After adding plus: " + addPlusToElements((ArrayList<String>) wordsList));
    }

    public static ArrayList<String> addPlusToElements(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).endsWith("+")) {
                continue;
            }
        }
        return list;
    }
}













