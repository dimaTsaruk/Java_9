package Baha_classes.Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class mapIntro1 {
    /**
     * Map is an Interface that's part of Java Collection Framework
     * Map stores Objects in Key, Value pair aka entry
     * Map interface has 3 implementations:
     * - HashMap<K, V> -> without any orders of the keys , allows one null key
     * - LinkedHashMap<K, V> - orders elements in inserted order of the entries, allows one null key
     * - TreeMap<K, V> -> orders its elements in natural order of the key, doesnt allow null key
     *
     */
    public static void main(String[] args) {
        String ssnElena = "011-10-1-11";
        String nameElena = "Elena Sova";

        // create an object of map with String for key type and for String value type
        Map<String, String> map = new HashMap<String, String>();

        // If the map already contains a mapping for the key, the old value is replaced by new value.

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John Doe");
        String studentName = students.get(1);
        System.out.println(studentName);

        Map<String, Integer> cityZip = new HashMap<>();
        cityZip.put("Chicago", 12345);
        cityZip.put("LA", 56789);
        cityZip.put("NY", 87654);
        cityZip.put("LA", 876567);
        System.out.println(cityZip);

    }
}










