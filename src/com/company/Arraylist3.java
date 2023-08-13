package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2d array list
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        //input nos
        System.out.println("enter nos for 2d array list");
        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        // add elements
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        //printing the list
        System.out.println(list);
    }
}
