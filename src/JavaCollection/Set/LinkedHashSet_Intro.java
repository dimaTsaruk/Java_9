package JavaCollection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Intro {
    /**
     * Java LinkedHashSet_Intro class is a Hashtable and Linked list implementation of the
     * set interface. It inherits HashSet class and implements JavaCollection.Set interface.
     * <p>
     * LinkedHashSet_Intro:
     * -> contains unique elements only (same as HashSet)
     * -> provides all optional set operation and permits null elements
     * -> non synchronized
     * -> maintains insertion order
     * -> requires more memory than HashSet
     * -> faster performance than HashSet
     * <p>
     * LinkedHashSet_Intro extends HashSet class which implements JavaCollection.Set interface
     * *** java.util.LinkedHashSet_Intro
     * <p>
     * Difference HashSet and LinkedHashSet_Intro is that last one maintains the insertion order.
     * We can predict insertion order in LinkedHashSet_Intro.
     * When we need to maintain insertion order -> use LinkedHashSet_Intro.
     * In case we don't care about insertion order -> use HashSet.
     */


    // Constructors
    //HashSet() , HashSet(Collection c), LinkedHashSet_Intro(int capacity)
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh_set = new LinkedHashSet<>();
        HashSet<Integer> h_set = new HashSet<>();
        //fill in LinkedHashSet
        lh_set.add(1);
        lh_set.add(2);
        lh_set.add(3);
        lh_set.add(4);
        lh_set.add(5);

        // fill in HashSet
        h_set.add(1);
        h_set.add(2);
        h_set.add(3);
        h_set.add(4);
        h_set.add(5);

        Iterator li = lh_set.iterator();
        Iterator hi = h_set.iterator();
        for (int x : lh_set)
            System.out.print(x + " ");
        System.out.println();
        for (int x : h_set)
            System.out.print(x + " ");


        // System.out.println(lh_set);
        // System.out.println(h_set);

    }

}





