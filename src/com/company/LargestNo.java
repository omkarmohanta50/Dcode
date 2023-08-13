/* 5. Take 2 numbers as input and print the largest number.*/
package com.company;

import java.util.Scanner;
public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b)
            System.out.println(a +" is greatest");
        else
            System.out.println(b +" is greatest");
    }
}
