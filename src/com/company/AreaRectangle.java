//3. Area Of Rectangle Program
package com.company;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and bredth of rectangle");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        int area = len* bre;
        System.out.println("area of the rectangle is " + area);
    }
}
