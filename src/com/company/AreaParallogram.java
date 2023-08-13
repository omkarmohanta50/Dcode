//5. Area Of Parallelogram
package com.company;

import java.util.Scanner;

public class AreaParallogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and height of parallogram");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = b*h;
        System.out.println("area of parallogram is " + area);
    }
}
