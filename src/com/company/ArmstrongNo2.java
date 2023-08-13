package com.company;
import java.util.Scanner;
public class ArmstrongNo2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int sum = 0;
            int temp = number;
            int digits = String.valueOf(number).length();

            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }

            if (number == sum) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }

}
