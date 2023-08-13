//Take 10 integer inputs from user and store them in an array.
// Again ask user to give a number. Now, tell user whether that number is present in array or not.
package com.company;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nos of array");
        for (int i = 0;i<=9;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a no to search");
        int no = sc.nextInt();
        for (int i = 0;i<=9;i++){
            if (arr[i]== no) {
                System.out.println("no is present");
                break;
            }
        }

    }
}
