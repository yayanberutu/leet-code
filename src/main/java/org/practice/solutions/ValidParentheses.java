/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: ValidParentheses.java , v 0.1 2024-08-01 00.00 Yosepri Disyandro Berutu Exp $$
 */
public class ValidParentheses {

    /**
     * https://leetcode.com/problems/valid-parentheses/?envType=study-plan-v2&envId=top-interview-150
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        Map<Character, Character> parentheses = buildParentheses();

        Stack<Character> strStack = new Stack<>();
        for(Character c : s.toCharArray()) {

            // if open parentheses
            if (parentheses.containsKey(c)) {
                strStack.push(c);
            }
            // if close parentheses, pop the stack and compare if match
            else {

                if (strStack.empty()) {
                    return false;
                }

                Character poppedChar = strStack.pop();
                if (!isValidPair(parentheses, poppedChar, c)) {
                    return false;
                }
            }
        }

        return strStack.empty();
    }

    public Map<Character, Character> buildParentheses() {
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(',')');
        parentheses.put('{','}');
        parentheses.put('[', ']');

        return parentheses;
    }

    public boolean isValidPair(Map<Character, Character> parentheses, Character openChar, Character closeChar) {
        return (closeChar.equals(parentheses.get(openChar)));
    }


}
