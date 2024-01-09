package com.company;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {8,1,98,5,6,24,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int smallest = i;
            for (int j= i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[smallest];
            arr[smallest]= temp;
        }
    }

}
