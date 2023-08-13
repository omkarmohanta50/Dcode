//2. Calculate Electricity Bill
package com.company;

import java.util.Scanner;

public class ElectryBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter no of unit per month");
        double bill = 0;
        int unit = sc.nextInt();
        if (unit < 100){
            bill = unit * 1.20;
        }
        else if (unit<300){
            bill = 100 * 1.20 +(unit -100)* 2;
        }
        else if (unit>300){
            bill = 100 * 1.20 + 200*2+(unit - 300)*3;
        }
        System.out.println("electry bill for this month is = " + bill);
    }
}
