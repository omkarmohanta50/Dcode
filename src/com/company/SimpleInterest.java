/* 3. Write a program to input principal, time, and rate (P, T, R) from the user and
        find Simple Interest.*/
package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p,t,r,si;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal ammount");
        p = sc.nextFloat();
        System.out.println("enter the time");
        t = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        r = sc.nextFloat();
        si = ((p*t*r)/100);
        System.out.println("simple interest = "+ si);
    }
}
