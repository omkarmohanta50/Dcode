// write a program using recursion to input a no and print nos from 1 to n
package com.company;

public class Recursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) {


            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}

