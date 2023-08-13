/*4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        (Use if conditions)*/
package com.company;

import java.util.Scanner;
public class IfConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter an operator(+,-,*,/)");
        char op = sc.next().charAt(0);
        if(op == '+')
            System.out.println(num1 + "+"+ num2+" = "+(num1+num2));
        if (op == '-')
            System.out.println(num1 + "-" + num2+" = "+(num1-num2));

        if (op == '*')
            System.out.println(num1 + "*" + num2+" = "+(num1*num2));
        if (op == '/')
            System.out.println(num1 + "/" + num2+" = "+(num1/num2));
    }
}
