package com.company;

public class test {
    public static void main(String[] args) {
        System.out.println(prod(2354));
    }
    static int prod(int n ){
        if (n % 10 == n){
            return n;
        }
        return (n%10) * prod(n/10);
    }
    static int count(int n){
        if (n%10 == 0){

        }
return 0;
    }

}


