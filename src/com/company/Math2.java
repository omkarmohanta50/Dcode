package com.company;
// GCD AND LCM
public class Math2 {
    public static void main(String[] args) {
        System.out.println(LCM(4,8));
    }
    static int GCD(int a, int b){
        if( a == 0){
            return b;
        }
        return GCD(b%a, a);
    }
    // mf this is the formula
    static int LCM(int a, int b){
        return a * b/ GCD(a,b);
    }
}
