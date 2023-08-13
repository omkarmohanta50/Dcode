//search in range
package com.company;
public class linearsearch3 {
    public static void main(String[] args) {
        int[] array = {12,-2,23,45,80,41};
        int target = 120;
        int ans = linearsearch(array,target,1,5);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start;i<=end;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
