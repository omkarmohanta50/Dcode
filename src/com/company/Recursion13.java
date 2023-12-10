// linear search in an array using recursion
// find an element in an array using recursion
package com.company;

import java.util.ArrayList;

public class Recursion13 {
    public static void main(String[] args) {
        int[] array = {1,3,24,26,26,56};
        int target = 56;
        System.out.println(find(array,target,0));
        System.out.println(findIndex(array,target,0));
        System.out.println(findIndexLast(array,target, array.length-1));
//        findAllIndex(array,26,0);
//        System.out.println(list);
        ArrayList<Integer> ans = findAllIndex(array,26,0,new ArrayList<>());
        System.out.println(ans);


    }
    // return true if the element is present in array
    static boolean find(int[] arr, int target, int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]== target || find(arr,target,index+1);
    }

    // return index of the target element
    static int findIndex(int[] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
    // find index from last
    static int findIndexLast(int[] arr, int target, int index){
        if (index==-1){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }
        else {
            return findIndexLast(arr,target,index-1);
        }
    }

    // find all index
    static ArrayList<Integer>list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index== arr.length){
            return ;
        }
        if (arr[index]== target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index== arr.length){
            return list;
        }
        if (arr[index]== target){
            list.add(index);
        }
       return findAllIndex(arr,target,index+1,list);
    }
}
