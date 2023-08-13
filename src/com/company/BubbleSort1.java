package com.company;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps for n-1 times
        for (int i = 0;i<arr.length-1;i++){
            //for each step the max item will come to the last
            swapped = false;
            for (int j= 0;j<arr.length-i-1;j++){
                //swap the item if it is smaller than the previous item
                if (arr[j+1]<arr[j]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            // if in the inner loop no element is swapped then the array is sorted and no need to check further
            if (!swapped)
                break;
        }
    }
}
