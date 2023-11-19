// reverse of a no using recursion
package com.company;

public class Recursion9 {
    public static void main(String[] args) {
        System.out.println(rev(2456));
    }
    static int rev(int n){
        if (n%10== 0)
            return 1;
        return (n%10)*10 + rev(n/10);
    }
}
