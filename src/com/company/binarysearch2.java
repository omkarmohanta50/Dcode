// order agnoustic binary search
package com.company;

public class binarysearch2 {
    public static void main(String[] args) {
        int[] array1 = {-3,0,2,8,13,35};
        int[] array2 = {35,13,8,2,0,-3};
        int target = 13;
        int ans = orderAgnoustcBS(array2,target);
        System.out.println(ans);
    }
    static int orderAgnoustcBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        // find wheatehr the array is acsendng or not
        boolean isAsc ;
        if (arr[start]< arr[end])
            isAsc = true;
        else isAsc = false;
        // boolean isAsc = arr[start]< arr[end];
        while (start<= end){
            // find the middle element
            int mid = start + (end-start)/2;

            if (arr[mid]== target)
                return mid;
            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;

                }
                else start = mid+1;
            }
            else {
                if (target>arr[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
        }
        return -1;
    }
}
