package JavaCollection.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetClass {

    // Java HashSet class is used to create a collection that uses a hash table for storahe.

    /**
     * HashSet stores the elements by using a mechanism called hashing.
     * HashSet contains unique elements only
     * HashSet allows null value
     * HashSet class in non synchronized
     * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashCode.
     * HashSet is the best approach for search operation.
     * The initial default capacity of HashSet is 16 and the load factor is 0.75
     * <p>
     * Difference between List and JavaCollection.Set
     * List can contain duplicate elements, JavaCollection.Set - doesn't contain duplicates.
     * HashSet extends AbstractSet -> implements -> JavaCollection.Set extends Collection extends Iterable
     * <p>
     * HashSet constructors : HashSet() , HashSet(int capacity), + 2 others
     */

    public static void main(String[] args) {
        // Methods of HashSet
        // 1. boolean add(E e) -> add specified element to this set if it's not already present
        // 2. void clear() -> remove all elements from the set
        // 3. object clone() -> return a copy of the HashSet instance: the elements are not cloned;
        // 4. boolean contains(Object o) -> return true if set contains the specified element
        // 5. boolean isEmpty() -> return true if set contains no elements
        // 6. Iterator<E> iterator() -> return an iterator over the elements in this set.
        // 7. boolean remove(Object o) -> remove the specified element from this set
        // 8. int size() -> return the number of elements in the set

        /*HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3); // doesn't add new '3'
        Iterator<Integer> iterator = set.iterator();
        for (int x : set)
            System.out.print(x + " ");

        System.out.println();


        HashSet<Integer> set1 = new HashSet<>();
        set1.add(8);
        set1.add(3);
        set1.add(9);
        set1.add(1);
        set1.addAll(set);
        System.out.println(set1);
        Iterator<Integer> iterator1 = set1.iterator();
        for (int x : set1)
            System.out.print(x + " ");

        set1.remove(9);
        System.out.println(set1);
        set.removeAll(set1);
        set.clear();
        System.out.println(set);*/

        // HashSet from another collection
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
        set.add("Four");
        set.add("Five");
        set.add("Six");

        System.out.println(set);
        System.out.println(set.size());
        set.add("Four");
        System.out.println(set.size());


    }


}


















