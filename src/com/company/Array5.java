//Find largest and smallest elements of an array
package com.company;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter array elements");
        for (int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int larg= arr[0];
        for (int i = 0;i<arr.length;i++){
           // int larg = arr[0];
            if (arr[i]>=larg){
                larg = arr[i];
            }

        }
        System.out.println("largest no is "+ larg);
    }
}
