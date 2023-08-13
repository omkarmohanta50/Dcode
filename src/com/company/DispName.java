/*2. Take name as input and print a greeting message for that particular name.*/
package com.company;

import java.util.Scanner;

public class DispName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what's your name darling");
        String name = sc.next();
        System.out.println("hello "+name+" how are you sweetheart ..hopefully you are fine. This is just a reminder that you are mine");
    }
}
