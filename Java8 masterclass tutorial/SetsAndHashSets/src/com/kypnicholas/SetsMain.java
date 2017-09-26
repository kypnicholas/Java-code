package com.kypnicholas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nkypr on 09/08/2017.
 */
public class SetsMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);                                //We are initializing (adding) the squares into the new union set
        union.addAll(cubes);                                                        //then we add all the cubes as well
        System.out.println("Union contains " + union.size() + "  elements.");       //That returns 196 elements which means the intersection must contain 4 elements

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for(int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        System.out.println("===============================================");
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words) {
            System.out.println(s);
        }

        System.out.println("===============================================");
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));          //Adding natureWords to our nature set

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));          //Adding divineWords to our divine set


        //ASYMMETRIC SET DIFFERENCE
        //i.e. the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.
        System.out.println("(Asymmetric set difference) nature - divine:");         //To print nature words minus divine words
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("(Asymmetric set difference) divine - nature:");        //To print divine words minus nature words
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);


        //SYMMETRIC SET DIFFERENCE
        //set of elements contained in either of two specified sets but not in both.
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);


        System.out.println("===============================================");
        //Following are generic tests you can utilise to find out if a set is a super set of another set
        //These tests are NON-DESTRUCTIVE, which ,means they just return True or False instead of modifying any of the sets
        if(nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)) {
            System.out.println("intersection is  subset of nature");
        }

        if(divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
