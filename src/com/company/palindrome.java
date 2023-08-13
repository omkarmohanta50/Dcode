//8. To find out whether the given String is Palindrome or not.

package com.company;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the string to check");
        String str = sc.nextLine();
        if (ispallindrome(str)){
            System.out.println("the given string is pallindrome");
        }
        else
            System.out.println("the string is not pallindrome");
    }

    private static boolean ispallindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

