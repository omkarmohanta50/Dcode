//find the maximum no in the given range
package com.company;

public class Array9 {
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,32};
        System.out.println(MaxRange(arr,1,3));
    }
    static int MaxRange(int[] arr,int start,int end){
        int max = arr[start];
        for (int i=start;i<= end;i++){
            if (arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}

// work on edge cases for better code
