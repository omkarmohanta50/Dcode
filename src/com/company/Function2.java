//Define a program to find out whether a given number is even or odd
package com.company;

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a no to check");
        int num = sc.nextInt();
        evenodd(num);

    }
    static void evenodd(int a ){
        if (a % 2 == 0)
            System.out.println(" the no " + a + " is even");
        else System.out.println(" the no "+ a + " is odd");
    }
}
