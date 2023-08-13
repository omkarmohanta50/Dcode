// search in 2d array
package com.company;

import java.util.Arrays;

public class linearsearch4 {
    public static void main(String[] args) {
        int[][] arr = {
                {12,4,2,57},
                {6,45,3,97,56},
                {32,59,26},
                {264,51}
        };
        int target = 36;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                if (arr[i][j] ==target ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
