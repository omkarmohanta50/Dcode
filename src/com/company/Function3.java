//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package com.company;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age to check");
        int age = sc.nextInt();
        isAdult(age);

    }
    static void isAdult(int a){
        if (a > 18)
            System.out.println(" the person is eligible to vote");
        else System.out.println(" the person is not eligible to vote");
    }
}
