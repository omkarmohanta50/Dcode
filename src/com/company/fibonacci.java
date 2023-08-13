//7. To calculate Fibonacci Series up to n numbers.
package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a= 0, b= 1,c,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of terms");
        n = sc.nextInt();
        if(n==1)
            System.out.println(a);
        if(n==2)
            System.out.println(b);
        System.out.print(a +""+ b);
        for(int i = 3;i<=n;i++){
            c = a+b;
            System.out.print(c);
            a = b;
            b = c;

        }
    }
}
