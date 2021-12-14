package Baha_classes.Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class IslesInStore {
    public static void main(String[] args) {
        Map<Byte, String> islesMap = new HashMap<>();
        islesMap.put((byte) 1, "Pharmacy");
        islesMap.put((byte) 2, "Fruits");
        islesMap.put((byte) 3, "Home goods");
        islesMap.put((byte) 4, "Electronics");

        System.out.println(islesMap);
        System.out.println("This department is " + islesMap.get((byte)3));

        // remove() - returns value of removed key. if the entry or key doesn't exist , returns null;
        System.out.println(islesMap.remove((byte)4));
        System.out.println(islesMap.remove((byte)40));

        // replace() - returns the replaced value associated with this key previously.


    }

}
