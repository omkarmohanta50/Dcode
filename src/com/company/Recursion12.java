// recursion array questions. check wheather an array is in ascending order or not
package com.company;

public class Recursion12 {
    public static void main(String[] args) {
        int[] array = {1,3,15,6,8,9};
        System.out.println(sorted(array,0));
    }
    static boolean sorted(int[] arr, int index){
        // base condition
        if (index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
