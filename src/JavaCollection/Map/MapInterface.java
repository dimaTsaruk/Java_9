package JavaCollection.Map;

import java.util.*;

public class MapInterface {
    /**
     * Map contains values on the basis of: key - value pair. Each k-v pair is known as entry.
     * Map contains unique entries. Map is useful when you have to search, update, delete elements
     * on the basis of a key.
     * There are two interfaces for implementing Map:
     * -> Map (classes: HashMap, LinkedHashMap)
     * -> SortedMap (TreeMap)
     * Map doesn't allow duplicate key, but duplicate values is allowed.
     * HashMap and LinkedHashMap allow null keys and values, TreeMap - doesn't allow any null key or value.
     * <p>
     * HashMap -> implementation of Map, it doesn't maintain any order.
     * LinkedHashMap -> implementation of Map; inherits HashMap class. Maintains insertion order.
     * TreeMap -> implementation of Map and SortedMap. Maintains ascending order.
     */
    public static void main(String[] args) {
        // Map Interface methods
        //1. put (Object key, Object value) -> insert an entry in the map
        //2. void putAll(Map map) -> insert the specified map in the map
        //3. remove(Object key) -> delete an entry for the specified key
        //4. boolean remove(Object key, Object value) -> removes the specified value associated with key.
        //5. Set keySet() -> returns the Set view containing all the keys
        //6. Set<Map.Entry<K,V>> entrySet() -> returns Set with all the keys and values
        //7. void clear() -> reset the map
        //8. boolean containsValue(Object value) -> return true if value is present in map
        //9. boolean containKey(Object key) -> return true if key present in map
        //10. boolean equals(Object o) -> compare Object with a Map
        //11. get(Object key) -> returns the object that contains the value associated with the key
        //12. int hashCode() --> returns the hash code of the Map
        //13. boolean isEmpty() -> check if Map is empty
        //14. replace(K key, V value) -> replaces the specified value for a specified key
        //15. Collection values() -> returns a collection view of the values contained in the map
        //16. int size() -> returns the number of entries in the map

        /**
         * Map.Entry Interface -> sub interface of Map. Accessed by Map.Entry name
         * -> returns a collection view of the map, whose elements are of this class.
         * -> it provides methods to get key and value.
         */
        //Map.Entry Interface methods
        //1. K getKey() -> obtain a key
        //2. V getValue() -> obtain value
        //3. setValue() -> replace the value with new value

        HashMap<Integer, String> calendar = new HashMap<>();
        calendar.put(1, "January");
        calendar.put(2, "February");
        calendar.put(3, "March");
        calendar.put(4, "April");
        calendar.put(5, "May");
        calendar.put(6, "June");
        calendar.put(7, "July");
        calendar.put(8, "August");
        calendar.put(9, "September");
        calendar.put(10, "October");
        calendar.put(11, "November");
        calendar.put(12, "December");

        //System.out.println(calendar);
        /*Set set = calendar.entrySet(); // converting to Set so we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            // Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

        for (Map.Entry m : calendar.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }


    }
}

























