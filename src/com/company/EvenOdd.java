/*1. Write a program to print whether a number is even or odd, also take
        input from the user.*/
package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to check");
        num = sc.nextInt();
        if(num%2==0)
            System.out.println("the no "+num +" is even");
        else
            System.out.println("the no "+num+" is odd");
    }
}
