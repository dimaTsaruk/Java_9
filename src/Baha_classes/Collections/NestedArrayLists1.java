package Baha_classes.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedArrayLists1 {
    public static void main(String[] args) {
        // ArrayList can store other collection as elements

        ArrayList<String> school1 = new ArrayList<>(Arrays.asList("Staford", "Harvard", "OSU"));
        ArrayList<String> school2 = new ArrayList<>(Arrays.asList("MIT", "NWU", "UI", "Berkeley"));

        ArrayList<ArrayList<String>> schoolList = new ArrayList<>(Arrays.asList(school1, school2));

        // ArrayList<ArrayList<String>> schoolList = new ArrayList<>();
        //schoolList.add(school1);
        // schoolList.add(school2);

        System.out.println("School 1: " + school1);
        System.out.println("School 2: " + school2);
        System.out.println("School list: " + schoolList);


       }


    }

