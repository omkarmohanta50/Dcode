// in a given array every no appear twice only one no appear oncce give that no
package com.company;

public class Bitwise2 {
    public static void main(String[] args) {
        int arr[]= {2,6,3,6,3,8,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique^= n;
            // xor that array with 0 and you will get the unique no and store it in a variable
        }

        return unique;

    }
}
