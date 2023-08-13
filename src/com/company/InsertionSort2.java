package com.company;

import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] arr = {34,6,54,2,1,57};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    // another approach to the insertion sort
    static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;

            }
            arr[j+1]= temp;

        }
    }
}
