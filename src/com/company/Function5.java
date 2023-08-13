//Define a method that returns the product of two numbers entered by user.
package com.company;

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no to check");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        product(a,b);

    }
    static void product(float a,float b){
        double c = a*b;
        System.out.println("the product is "+ c);
    }
}
