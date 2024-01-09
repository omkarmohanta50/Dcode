//Toggle String :
//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/

package com.company;

import java.util.*;

public class Strings1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLowerCase(name.charAt(i))) {
                System.out.print(Character.toUpperCase(name.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(name.charAt(i)));
            }
        }

    }
}


