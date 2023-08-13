//1. Area Of Circle Java Program
package com.company;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the radius of circle");
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println(" area of the circle is " + area);
    }
}
