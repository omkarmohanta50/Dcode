//24. Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)
package com.company;

import java.util.Scanner;

public class UsrInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println(" enter the integers");
        while (true){
            int input = sc.nextInt();
            if (input ==0)
                break;

            res = res+ input;

        }
        System.out.println(" result = "+ res);
    }
}
