//Initialize and print all elements of a 2D array.
package com.company;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println("enter the elements of 2d array");
        for (int row = 0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                arr[row][col]= sc.nextInt();
            }
        }
        for (int row = 0;row<=arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
        }
    }
}
