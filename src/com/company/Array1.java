//Take 10 integer inputs from user and store them in an array and print them on screen
package com.company;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 nos");
        for (int i = 0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0;i<10;i++){
            System.out.print(arr[i]);
        }

    }
}
