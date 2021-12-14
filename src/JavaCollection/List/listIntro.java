package JavaCollection.List;

import java.util.*;

public class listIntro {
    public static void main(String[] args) {

        /*List<Integer> scores = new ArrayList<>();
        scores.add(76);
        scores.add(83);
        scores.add(77);
        System.out.println("Average: " +
                (scores.get(0) + scores.get(1) + scores.get(2)) / scores.size());

        List<String> names = new LinkedList<>();
        names.add("Inna");
        names.add("Alex");
        names.add("Sub-zero");
        Iterator it = names.iterator();
        for (String name : names)
            System.out.print(name + " ");

         */
        // #########  Java List Methods ##########
        //1. void add(int index, E element) -> insert element at the specified position in a list.
        //2. boolean add(E e) -> append element at the end of the list.
        //3. boolean addAll(Collection<? extends E> c) -> append all elem.of collection in the end of a list.
        //4. boolean addAll(int index, Collection<? extends E> c) -> append..., starting from index position.

        List<String> names = new ArrayList<>();
        List<String> def = new ArrayList<>(Arrays.asList("d", "e", "f"));

        names.add("B");
        names.add("C");
        System.out.println(names);

        names.add(0, "A");
        System.out.println(names);

        names.addAll(def);
        System.out.println(names);

        names.addAll(0, new ArrayList<>(Arrays.asList("0", "1", "2")));
        System.out.println(names);


        //5. void clear() -> remove all el.from list
        //6. boolean equals(Object o) -> compare with another list
        //7. int hashcode() -> return hash code value of the list
        //8. E get(int index) -> return element from index position
        //9. boolean isEmpty() -> check if list is empty
        //10. int lastIndexOf(Object o) -> return int index of o , or -1 if list doesn't contain o.

        // names.clear();
        // System.out.println(names);
        // List<Object> l = new ArrayList<>(Arrays.asList("0", "1", "2", "A", "B", "C", "d", "e", "f"));
        List<Object> l = new ArrayList<>(Arrays.asList("0", "1", "2", "f", "A", "B", "C", "d", "e", "f"));
        System.out.println(names.equals(l));

        System.out.println(("" + l.get(1) + l.get(5)));
        int ten = l.lastIndexOf("f") - l.lastIndexOf("z");
        System.out.println(ten);

        //11. Object[] toArray()	-> return an array containing all elements in this list in the correct order.
        //12. <T> T[] toArray(T[] a)	-> return an array containing all elements in this list in the correct order.
        Object[] arr = new Object[names.size()];
        arr = names.toArray(arr);
        System.out.println(Arrays.toString(arr));

        //13. boolean contains(Object o) -> returns true if the list contains the specified element
        //14. boolean containsAll(Collection<?> c) -> returns true if the list contains all the specified element
        System.out.println(names.contains("d"));
        System.out.println(names.containsAll(l));

        //15. int indexOf(Object o)	-> return index of first o, or -1 if list doesn't contain o
        System.out.println(names.indexOf("f"));
        System.out.println(l.indexOf("l"));

        //16. E remove(int index) -> remove element at specific position
        //17. boolean removeAll(Collection<?> c) -> remove all the elements from the list
        System.out.println(l.remove(3)); // return removed element
        System.out.println(l.removeAll(Arrays.asList("0", "1", "2", "3"))); // just specify elements you want to remove
        System.out.println(l);

        //18. void replaceAll(UnaryOperator<E> operator) -> replace all elem. with specified element
        //l.replaceAll(xxx);
        //19. void retainAll(Collection<?> c) -> retain all elements in the list that are present in the specified collection.
        l.retainAll(Arrays.asList("A", "B", "C"));
        System.out.println(l);

        //20. E set(int index, E element) -> replace the specified element in the list, present at the specified position.
        l.set(0, "Z");
        System.out.println(l.set(0, "Z")); // return new replaced element
        System.out.println(l);
        // System.out.println(l.set(4, "Y")); -> IndexOutOfBoundException

        //21. void sort(Comparator<? super E> c) -> sort the elements of the list on the basis of specified comparator.
        //22. List<E> subList(int fromIndex, int toIndex) -> return list of elem-s of given range, not include toIndex
        List<Integer> n = new ArrayList<>(Arrays.asList(3, 2, 1, 2, 3, 4, 5));
        System.out.println(n.subList(2, 5));

        // Convert Array to List
        int[] aList = {3, 4, 5, 6, 7};
        List<Integer> numList = new ArrayList<>();

        for (int i : aList)
            numList.add(i);
        System.out.println(numList);

        // List to Array
        ArrayList<String> abc = new ArrayList<>(Arrays.asList("a", "b", "c"));
        String[] abc_arr = new String[abc.size()];
        abc_arr = abc.toArray(abc_arr);
        System.out.println(abc);

        // sort List : Collection.sort()
        ArrayList<String> unsort = new ArrayList<>(Arrays.asList("d", "g", "f", "b", "a", "e", "c"));
        System.out.println("Before sorting: ");
        System.out.println(unsort);
        Collections.sort(unsort);
        System.out.println("After sorting: ");
        System.out.println(unsort);


    }
}
