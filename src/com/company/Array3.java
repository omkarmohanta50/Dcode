//Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
package com.company;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] newarr = new int[10];
        System.out.println("enter 10 nos");
        for (int i =0;i<=9;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0;i<10;i++){
            newarr[i]= arr[9-i];
        }
        for (int i =0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0;i<10;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
