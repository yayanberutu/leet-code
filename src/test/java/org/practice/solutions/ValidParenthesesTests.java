/**
 * Copyright (c) 2024 All Rights Reserved
 */
package org.practice.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: ValidParenthesesTests.java , v 0.1 2024-08-01 11.05 Yosepri Disyandro Berutu Exp $$
 */
public class ValidParenthesesTests {

    @Test
    void ValidParentheses_isValidTrue() {
        ValidParentheses validParentheses = new ValidParentheses();

        String str = "()[]{}";
        Assertions.assertTrue(validParentheses.isValid(str));
    }

    @Test
    void ValidParentheses_isValidFalse() {
        ValidParentheses validParentheses = new ValidParentheses();

        String str = "(]";
        Assertions.assertFalse(validParentheses.isValid(str));
    }

    @Test
    void ValidParentheses_isValidFalseOneChar() {
        ValidParentheses validParentheses = new ValidParentheses();

        String str = "(";
        Assertions.assertFalse(validParentheses.isValid(str));
    }
}
