// find the i th bit of a no
package com.company;

public class Bitwise3 {
    public static void main(String args[]){
        int no = 14;
        int n = 3;
        System.out.println(ans(no,n));
    }

    private static int ans(int no, int n) {
        //return (no & (1<<(n-1)));
        return ((n & (1<< (n - 1))) >> (n - 1));
    }
}

// wrong solution will have to look for a better approach