//3. Calculate Average Of N Numbers
package com.company;

import java.util.Scanner;

public class AverageOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms,sum=0,i,num,avg;
        System.out.println(" how many no to calculate");
        terms = sc.nextInt();
        System.out.println(" enter the nos");
        for (i = 1;i<=terms;i++){
            num = sc.nextInt();
            sum = sum + num;

        }
        avg = sum /terms;
        System.out.println("the average of "+ terms +" no of terms is " + avg);
    }
}
