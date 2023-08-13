//4. Area Of Isosceles Triangle
package com.company;

import java.util.Scanner;

public class AreaIsoscalace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and bredth of rectangle");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = b*h/2;
        System.out.println("area of isoscalace triangle is " + area);
    }
}
