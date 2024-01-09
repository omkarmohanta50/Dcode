// take input and print a 2d array
package com.company;

import java.util.*;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        System.out.println("enter the array elements");
        Scanner in = new Scanner(System.in);


        for (int row = 0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();

            }
        }

//        for (int row = 0;row<arr.length;row++){
//            for (int col = 0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//        }

        for (int row = 0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
