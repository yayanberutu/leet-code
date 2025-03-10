/**
 * Dana.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package org.practice;

import java.util.*;

/**
 * @author Yosepri Disyandro Berutu (yosepri.disyandro@dana.id)
 * @version $Id: StringProb.java , v 0.1 2025-03-09 20.05 Yosepri Disyandro Berutu Exp $$
 */
public class StringProb {
    public static void main(String[] args) {
        String str = "yosepri disyandro berutu";
        str = str.toUpperCase();


        String[] strArr = str.split(" ");
        List<String> strList = Arrays.asList(strArr);


//        System.out.println(str.substring(1, 1));
//        System.out.println(str.indexOf(" "));
        str = str.replace("YOSEP", "AYANG");
        System.out.println(str);
    }
}
