package com.company;

public class Solution{
    public static void main(String args[]){

        int[] arr = {-2,0,4,12,23,45,67,78,99};
        int[] arr2 = {98,87,45,34,29,23,11,10,4,2,-1};
        int target = 23;
        System.out.println(oabs(arr2,target));
    }
    static int Bsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        // condition
        while(start<=end){
            int mid=start+(end - start)/2;

            if (target<arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else
                //ans found
                return mid;
        }
        return -1;
    }

    static int oabs(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        //check wheather ascending or not
        boolean isAsc = arr[start]<arr[end];

        // condition
        while(start<=end){
            int mid=start+(end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
            // if ascending
            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
