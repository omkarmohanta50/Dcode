// binary search implimentation
package com.company;

public class binarysearch1 {
    public static void main(String[] args) {
        int[] array = {-12,-6,-2,0,4,13,24,35,43};
        int target = -6;
        int ans = bsearch(array,target);
        System.out.println(ans);
    }
    static int bsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //int mid = start + (end - start)/2;
            int mid = start + (end - start)/2;
            if (target<arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}