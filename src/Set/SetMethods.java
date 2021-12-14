package Set;

import java.util.*;

public class SetMethods {
    public static void main(String[] args) {
        /** In Set duplicate elements are not allowed.
         * Elements are not stored in order. Storing unique elements without duplication.
         * Implementation:
         * -> HashSet - most common, no duplicates, unordered.
         * -> LinkedHashSet - orders elements based on insertion order, store unique elem. in order.
         * -> TreeSet - orders elements based on their values, natural order.
         *
         */

        /*Set<Integer> numbers = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        Set<String> names1 = new HashSet<>(1000);

        List<Integer> listNumbers = Arrays.asList(3, 2, 4, 3, 2, 1, 9);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);*/

        //Methods
        // add()
        Set<String> cities = new HashSet<>();
        cities.add("Kyiv");
        cities.add("Lviv");
        cities.add("Odessa");
        cities.add("Uman");
        cities.add("Hust");
        System.out.println(cities);

        // remove()
        cities.remove("Hust");
        System.out.println(cities);

        // size()
        System.out.println("The size of set is " + cities.size());

        // contains()
        System.out.println(cities.contains("Odessa"));
        System.out.println(cities.contains("Sumy"));

        // clear()
        cities.clear();
        System.out.println(cities);

        // isEmpty()
        System.out.println(cities.isEmpty());


    }
}
