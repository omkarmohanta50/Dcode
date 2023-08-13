// search for a character in a string
package com.company;

public class linearsearch2 {
    public static void main(String[] args) {
        String name = "omkar";
        char c = 'j';
        boolean ans = ispresent(name,c);
        System.out.println(ans);
    }
    static boolean ispresent(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0;i<=str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
