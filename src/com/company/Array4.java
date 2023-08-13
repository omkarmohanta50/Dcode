//Write a program to find the sum and product of all elements of an array.
package com.company;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter array elements");
        for (int i = 0;i<=5;i++){
            arr[i]= sc.nextInt();
        }
        //for sum
        int sum=0;
        int prod = 1;
        for (int i=0;i<=5;i++){
            sum = sum+arr[i];
        }
        //for multiplication
        for (int i = 0; i<=5;i++){
            prod = prod * arr[i];

        }
        System.out.println("sum of all elements = "+ sum);
        System.out.println("product of all elements = "+ prod);
    }
}
