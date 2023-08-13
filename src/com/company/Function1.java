//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user
package com.company;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("enter 3 nos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println(" enter a for maximum and b for minimum");
        char sym = sc.next().charAt(0);
        switch (sym){
            case 'a': maximum(num1,num2,num3);
            break;
            case 'b': minimum(num1,num2,num3);
            break;
        }

    }
    static void maximum(int a, int b, int c){
        if (a >= b){
            if (a>=c)
                System.out.println( a + " is greatest");
            else System.out.println(c + " is greatest");

        }
        else {
            if (b >= c){
                System.out.println(b + " is greatest");
            }
            else System.out.println(c + " is greatest");
        }
    }
    static void minimum(int a, int b, int c){
        if (a <= b){
            if (a<=c)
                System.out.println( a + " is smallest");
            else System.out.println(c + " is smallest");

        }
        else {
            if (b <= c){
                System.out.println(b + " is smallest");
            }
            else System.out.println(c + " is smallest");
        }
    }
}
