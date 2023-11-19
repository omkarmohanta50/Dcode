// sum of digits
package com.company;

public class Recursion7 {
    public static void main(String[] args) {
        System.out.println(sum(2342));
    }
    static int sum(int n){
        if (n%10 == 0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }
}
