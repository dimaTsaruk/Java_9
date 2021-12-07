package Baha_classes.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        // 1. add() -> returns true if the set doesnt contain the specified element,
        // and false if the set already contains the specified element.
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        if (names.add("Peter")) {
            System.out.println("Peter is already added to the set");
        }
        if (!names.add("Tom")) {
            System.out.println("Tom is already added to the set");
        }

        // 2. remove (value) -> method removes the specified element from the set if it's present,
        // at this case method returns true, otherwise - false.
        if (names.remove("Mary")) {
            System.out.println("Mary is removed");
        }
        // 3. size() -> returns the  number of elem. in the set
        System.out.println("names contains " + names.size() + " elements.");

        //4. clear() -> (void return type) removes all elements from the set.
        //5. isEmpty() -> returns true if the set is empty, otherwise - false
        names.clear();
        if (names.isEmpty())
            System.out.println("The set is empty.");

        //6. contains(Object) - > return true if the set contains the specif. element, otherwise - false
        if (names.contains("Dima"))
            System.out.println("Dima found");
        else System.out.println("There's no such name");
        if (names.contains("Tom"))
            System.out.println("Tom found");
        else System.out.println("There's no such name");

        Set<Character> symbols = new HashSet<>(Arrays.asList('a', 'b', '$', '@', '*'));
        System.out.println(symbols);
        for (char c : symbols)
            System.out.print(c + " | ");
        System.out.println();

        // Using Iterator
        Iterator<Character> setIterator = symbols.iterator();
        while (setIterator.hasNext()) {
            System.out.print(setIterator.next() + " -> ");
        }


    }
}

