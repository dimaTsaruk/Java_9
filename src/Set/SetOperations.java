package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        /**
         * We can perform different operations with two sets as:
         * -> union
         * -> difference ...
         */

        Set<String> KyivStreets = new HashSet<>(Arrays.asList("Khrechatyk", "Bandery", "Honty", "Sirka", "Volodymyrska"));
        Set<String> LvivStreets = new HashSet<>(Arrays.asList("Shevchenka", "Bandery", "Lesi U.", "Sirka", "Franka"));

        // containsAll()
        System.out.println(KyivStreets.containsAll(KyivStreets));
        System.out.println(KyivStreets.size());
        System.out.println(KyivStreets.containsAll(LvivStreets));

        // addAll()
        KyivStreets.addAll(LvivStreets);
        System.out.println(KyivStreets);
        System.out.println(KyivStreets.size());

        // retainAll()
      //  KyivStreets.retainAll(LvivStreets);
      //  System.out.println(KyivStreets);

        // removeAll()
        KyivStreets.removeAll(LvivStreets);
        System.out.println(KyivStreets);

    }

}
