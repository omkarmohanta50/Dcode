package com.company;

import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int [] array={54,65,2,0,47,51};
        ssort(array);
        System.out.println(Arrays.toString(array));
    }
    static void ssort(int[] arr){

        for (int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static int getmaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i =start;i<=end;i++){

            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
