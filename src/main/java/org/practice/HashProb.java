/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;
import java.util.*;
/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: HashProb.java , v 0.1 2025-03-09 20.19 Yosepri Disyandro Berutu Exp $$
 */
public class HashProb {
    public static void main(String[] args) {
        // hashSetSample();
        Set<Integer> sampleLinkedHashSet = new LinkedHashSet<>();
        sampleLinkedHashSet.add(20);

        Set<String> sampleTreeSet = new TreeSet<>();
        sampleTreeSet.add("Yosep");
        sampleTreeSet.add("Zozo");
        sampleTreeSet.add("ZOZO");
        sampleTreeSet.add("Mita");
        sampleTreeSet.add("AyanG");
        System.out.println(sampleTreeSet);

    }

    public static void hashSetSample(){
        Set<Integer> sampleSet = new HashSet<>();
        sampleSet.add(8);
        sampleSet.add(9);
        sampleSet.add(1);
        sampleSet.remove(1);

//        System.out.println(sampleSet);

        Set<String> sampleStrSet = new HashSet<>();
        sampleStrSet.add("Yosepri");
        sampleStrSet.add("Zozo");
        sampleStrSet.add("Teteh");
        sampleStrSet.add("Atik");
        sampleStrSet.add("ZZZZ");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(50);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(40);
        hashSet.add(60);
        hashSet.add(70);
        hashSet.add(80);
        hashSet.add(90);
        hashSet.add(100);

        System.out.println(hashSet);
    }

    public static void sampleHashMap() {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);


    }

}
