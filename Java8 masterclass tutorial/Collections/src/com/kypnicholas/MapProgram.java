package com.kypnicholas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nkypr on 07/08/2017.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        //languages.put("Java", "a compiled high level, object-oriented, platform independent language");        //If we uncomment this, the result of the following if-statem. will change
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");     //'Java' is the key and the other param. is the value
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));         //these print null because it is the first time we instantiate them.
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println("================================================");

        languages.remove("BASIC");                                       //Remove entry with that key
        if(languages.remove("Algol", "test value")) {                       //Remove entry with that key/value combo only.
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        //loop through the keys of the map 'languages' and print out
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }


}
