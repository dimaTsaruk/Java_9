package JavaCollection.Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        // HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "Scott");
        m.put(104, "Mary");
        m.put(105, "Tye");
        m.put(103, "X");
        m.put(106, "Tye");


        System.out.println(m); // {101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
        //{101=John, 102=David, 103=X, 104=Mary, 105=Tye}
        System.out.println(m.get(105));

        m.remove(106); // remove pair from HashMap
        System.out.println(m);

        System.out.println(m.containsKey(101)); // true
        System.out.println(m.containsKey(106)); // false

        System.out.println(m.containsValue("Mary")); // true
        System.out.println(m.containsValue("Alex")); // false

        System.out.println(m.isEmpty()); // false

        // retrieve only keys from HashMap
        System.out.println(m.keySet()); // return all the keys as a Set
        for (Object i : m.keySet()) {
            System.out.println(i);
        }

        System.out.println(m.values()); // return all the values as Collection
        for (Object i : m.values()) {
            System.out.println(i);
        }

        System.out.println(m.keySet()); // return all the keys as a Set
        for (Object i : m.keySet()) {
            System.out.println(i + " " + m.get(i));
        }


        //System.out.println(m.entrySet()); // returns all the entries as Set


    }
}
