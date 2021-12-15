package JavaCollection.Set;

import java.util.TreeSet;

public class TreeSetIntro {
    /**
     * TreeSet class implements the JavaCollection.Set interface that uses a tree for storage. The objects of the TreeSet
     * class are stored in ascending order.
     * <p>
     * TreeSet:
     * -> contains unique elements (same as HashSet, LinkedHashSet)
     * -> access and retrieval times are quite fast
     * -> doesn't allow null element
     * -> non synchronized
     * -> maintains ascending order
     */

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        System.out.println(treeSet);
        /*Iterator iterator = treeSet.iterator();
        Iterator iterator1 = treeSet.descendingIterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        while (iterator1.hasNext())
            System.out.print(iterator1.next() + " ");*/

        System.out.println("Reverse set: " + treeSet.descendingSet());


    }
}











