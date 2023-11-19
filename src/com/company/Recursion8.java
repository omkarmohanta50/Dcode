// product of digits using recursion
package com.company;

public class Recursion8 {
    public static void main(String[] args) {
        System.out.println(prod(4372));
    }
    static int prod(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10)* prod(n/10);
    }
}
