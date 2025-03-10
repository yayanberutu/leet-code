/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;

import java.util.*;

/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: IntToRoman.java , v 0.1 2025-03-09 23.08 Yosepri Disyandro Berutu Exp $$
 */
public class IntToRoman {
    public static void main(String[] args) {
        Map<Character, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public String intToRoman(int num) {
        Map<Character, Integer> romanMap = constructRomanMap();

        String romanResult = "";

        while(num > 0) {
            if (isStartWith4Or9(num)) {

            } else {
                char biggestSmallerRoman = getBiggestSmallerRoman(num, romanMap);
                int biggerSmallerNum = romanMap.get(biggestSmallerRoman);

                romanResult += biggestSmallerRoman;
                num -= biggerSmallerNum;
            }
        }

        return romanResult;
    }

    public Map<Character, Integer> constructRomanMap() {
        Map<Character, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        return romanMap;
    }

    public boolean isStartWith4Or9(int num) {
        String strNum = String.valueOf(num);
        if (strNum.charAt(0) == '4' || strNum.charAt(0) == '9') {
            return true;
        }

        return false;
    }

    public char getBiggestSmallerRoman(int num, Map<Character, Integer> romanMap) {

        char selectedKey = 'I';

        for (Map.Entry<Character, Integer> entry : romanMap.entrySet()) {

            if (num < entry.getValue()) {
                break;
            }

            selectedKey = entry.getKey();
        }

        return selectedKey;
    }



}
