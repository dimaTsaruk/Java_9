package JavaCollection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration {
    /**
     * To iterate through the set , we can use different ways.
     * -> using enhanced loop
     * -> using Iterator
     * -> using forEach with lambda expression
     */
    public static void main(String[] args) {


        // Iterator
        Set<String> redLine = new HashSet<>
                (Arrays.asList("Lisova", "Khrechatyk", "Dnipro", "Hydro Park", "Universytet"));
        //System.out.println(redLine);

        Iterator<String> iterator = redLine.iterator();
        while (iterator.hasNext()) {
            String station = iterator.next();
            System.out.println(station);
        }

        // enhanced for loop
        for (String station : redLine)
            System.out.println(station);

        // forEach with lambda expression
        redLine.forEach(System.out::println);


    }
}












