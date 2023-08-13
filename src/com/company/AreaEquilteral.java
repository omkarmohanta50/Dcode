//Area Of Equilateral Triangle
package com.company;

import java.util.Scanner;

public class AreaEquilteral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sides of equilateral triangle");
        double a = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*(a*a);
        System.out.println("area = "+ area);
    }
}
