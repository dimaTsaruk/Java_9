package JavaCollection;

import java.util.*;

public class collectionMethods {

    public static void main(String[] args) {

        Set<Integer> id = new HashSet<>();
        List<Integer> IL_id = new ArrayList<>(Arrays.asList(111, 12, 121, 14, 13, 151, 14, 15));
        List<Integer> IL_id2 = new ArrayList<>(Arrays.asList(111, 121, 121, 141, 131, 151, 141, 151));


        //1. public boolean add() -> insert element to collection;
        id.add(123);

        // 2. public boolean addAll(...)
        // makes Set from array list
        id.addAll(IL_id);
        System.out.println(id);

        // 3. public boolean remove(Object element) -> removes element from the list/set (collection)
        id.remove(123);
        id.remove(13);
        System.out.println(id);

        // 4. public boolean removeAll(Collection<?> c) - remove one (all the element of one collection) collection from another
       /* IL_id.addAll(IL_id2);
        System.out.println(IL_id);
        IL_id.removeAll(IL_id2);
        System.out.println(IL_id);*/

        //5. public boolean retainAll(Collection c) -> delete all element of invoking collection, except specified collection
        // retain common elements
        List<String> names = new ArrayList<>(Arrays.asList("A", "C", "D", "E", "I"));
        List<String> names2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "I"));
        // IL_id.retainAll(IL_id2);
        // System.out.println(IL_id);
        // names.retainAll(names2); // a, c, d, e
        //names2.retainAll(names);
        System.out.println(names);
        System.out.println(names2);

        //6. public int size() -> return size
        System.out.println(names.size());
        System.out.println(names2.size());

        //7. public void clear() -> removes elements from the collection
        // names.clear();
       /* System.out.println(names);
        System.out.println(names.size());
        System.out.println(names2.size());*/

        //8. public boolean contains(Object) -> search for an element
       /* boolean result = names.contains("Dima");
        boolean result1 = names.contains("D");
        System.out.println(result);
        System.out.println(result1);*/

        // 9. public boolean containsAll(Collection c) -> search for specified collection in the collection
        List<String> subNames = new ArrayList<>(Arrays.asList("A", "C", "D"));
        List<String> subNames1 = new ArrayList<>(Arrays.asList("B", "C", "D"));
        boolean isCont = names.containsAll(subNames);
        System.out.println(isCont);
        System.out.println(names.containsAll(subNames1));

        // 10. public Iterator iterator -> returns iterator
        Iterator it = names.iterator();
        System.out.print("names content: ");
       /*  while (it.hasNext())
            System.out.print(it.next() + " " );*/

        for (String s : names)
            System.out.print(it.next() + " ");
        System.out.println();

        // 11. public Object[] toArray() -> converts collection to array
        // System.out.println(names.toArray()); // prints hasCode of array: [Ljava.lang.Object;@36baf30c
        Object[] arrNames = names.toArray();
        for (Object o : arrNames)
            System.out.print(o + " ");
        System.out.println();

        // 12. public <T> T[] toArray(T[] a) -> converts collection into array. T - ret.type.
        // arrayList to array convert.
        String[] arr = new String[names.size()]; // create String array with size of collection
        arr = names.toArray(arr);    // call method toArray and pass the argument  String array, save in String array
        System.out.println(Arrays.toString(arr));

        // Or make it in one line
        String[] strArray = names.toArray(new String[names.size()]);

        // 13. public boolean isEmpty() -> 	It checks if collection is empty.
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names.isEmpty());

        // 14. public boolean equals(Object element) -> It matches two collections.
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));

        // 15. public int hashCode()	-> returns hashCode of collection
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());

        // ########         Iterator methods ###############
        // 1. public boolean hasNext() -> check if iterator has more elements
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list1 = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        Iterator<Integer> iterator1 = list1.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator1.hasNext());

        // 2. public Object next() -> It returns the element and moves the cursor pointer to the next element.
        System.out.println(iterator.next());     // 1
        System.out.println(iterator.next());     // 2

        // 3. public void remove() -> It removes the last elements returned by the iterator. It is less used.
        iterator.remove();
        System.out.println(list);



    }
}
