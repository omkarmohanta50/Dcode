package com.company;


import java.util.Arrays;

class Solutions2 {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        insertion(array);
        System.out.print(Arrays.toString(array));
    }

    static void insertion(int[]arr){

        for (int i = 0; i < arr.length - 1; i++){

            for (int j = i+1; j > 0; j--){

                if (arr[j]<arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] =temp;
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr){

        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            // run the loop for n-i times every time
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped= true;
                }
            }
            // if no swap occure in one itteration then break and exit bcz array is sorted
            if (swapped==false){
                break;
            }
        }

    }
}
