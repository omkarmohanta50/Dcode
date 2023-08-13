//2. Area Of Triangle
package com.company;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of height and base");
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float area = ( b * h)/2;
        System.out.println("the area is " + area);
    }
}
