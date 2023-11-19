package com.company;

public class Bitwise1 {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(isodd(n));

    }
    static boolean isodd(int n){
        return( n & 1 )==1;
    }
}
