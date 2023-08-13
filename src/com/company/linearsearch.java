package com.company;

public class linearsearch {
    public static void main(String[] args) {
        int[] array = {12,3,23,64,54,99,52};
        int targetelement = 5;
        int ans = linearsearch(array,targetelement);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0;i<=arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
/*
public static void this ois also goinf to mae an difference and it ll aslo make a sigmificant difference
main(){
and oall tjhw exceptonal thng wll pass over the lmt an wllh du

 md = end 0 1 ama f ajf poja tout only perform lner search ont hge separated array and wll caughjt an auto transfer
 */