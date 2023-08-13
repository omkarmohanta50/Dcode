//9. To find Armstrong Number between two given number.
package com.company;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to ");
        int no = sc.nextInt();
        int originalNo,rem,sum = 0;
        originalNo = no;
        while(originalNo>0) {
            rem = originalNo % 10;
            sum = sum + (sum * sum * sum);
            originalNo = originalNo/10;
        }
        if (sum == no )
            System.out.println(" armstrong no");
        else
            System.out.println(" not an armstrong no");
    }
}
