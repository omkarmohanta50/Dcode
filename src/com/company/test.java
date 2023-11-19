package com.company;

public class test {
    public static void main(String[] args) {
        fun2(1);
    }
    static void fun(int n){
        if (n == 0)
            return;
        //System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    static void fun2( int n){
        if (n ==5){
            return;
        }
        System.out.println(n);
        fun2(n+1);
        //System.out.println(n);
    }
}


