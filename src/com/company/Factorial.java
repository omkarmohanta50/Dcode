//1. Factorial Program In Java
package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to find factorial");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial = factorial* i;
        }
        System.out.println("factorial =  " + factorial);
    }
}
