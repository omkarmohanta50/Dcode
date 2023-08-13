//8. Perimeter Of Circle
package com.company;

import java.util.Scanner;

public class PeriCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius ");
        float r = sc.nextFloat();
        double area = 2 * Math.PI * r;
        System.out.println("area = "+ area);
    }
}
