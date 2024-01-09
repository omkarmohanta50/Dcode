// sealing of a number

package com.company;

public class binarysearch3 {
    public static void main(String[] args) {
        int arr[] = {-12,-6,-2,0,4,13,24,35,43};
        System.out.println(sealing(arr,44));
    }
    static int sealing(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end -start);
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;
            }
            else return mid;
        }
        return start;
    }

}


