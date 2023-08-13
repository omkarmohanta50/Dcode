/*6. Input currency in rupees and output in USD.*/
package com.company;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value in inr");
        float inr = sc.nextFloat();
        double usd = inr / 74.05;
        System.out.println(inr + " rupees in dollar is "+ usd);

    }
}
/* there is a foramt specifier called %.2f in java dont know how to use it */