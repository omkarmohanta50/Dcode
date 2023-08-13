package com.company;

public class test {

        public static int subtractProductAndSum(int n) {
            int ldigit = n%10;
            return ldigit;
        }

    public static void main(String[] args) {
            int res = subtractProductAndSum(123);
        System.out.println(res);
    }
}

