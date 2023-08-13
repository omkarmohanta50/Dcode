//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
package com.company;

import java.util.Scanner;

public class Function8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        float marks = sc.nextFloat();
        grade(marks);

    }
    static void grade(float a){
        if (a>=91&& a<=100 )
            System.out.println("grade : AA");
        else if (a >=81 && a <=90)
            System.out.println(" grade : AB");
        else if (a >=71 && a <=80)
            System.out.println(" grade : BB");
        else if (a >=61 && a <=70)
            System.out.println(" grade : BC");
        else if (a >=51 && a <=60)
            System.out.println(" grade : CD");
        else if (a >=41 && a <=50)
            System.out.println(" grade : DD");
        else if (a < 40)
            System.out.println(" motherfucker you are fail bitch");
    }
}
/* 91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */