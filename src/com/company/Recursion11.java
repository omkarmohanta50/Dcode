// no of steps to reduce the no to zero
package com.company;

public class Recursion11 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
        }

    private static int helper(int num, int steps) {
        if (num ==0){
            return steps;
    }
        if (num%2 ==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
}
}
