package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args) {
        //taking input from user for arraylist
        //create an array list
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no for the array list");
        for (int i = 0;i<10;i++){
            list.add(sc.nextInt());
        }
        //printing the arraylist(get item at any index)

        for (int i = 0;i<10;i++){
            System.out.print(list.get(i));
        }
        //better way to print:
        System.out.println(list);
    }
}
