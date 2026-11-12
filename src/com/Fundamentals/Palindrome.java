package com.Fundamentals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String orig = input.next();
        char[] chars = orig.toCharArray();//convert string into array of characters
        int left = 0;
        int right = chars.length -1;
        //reversing the string
        while(left < right){

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(chars);//reversed string

        //comparing orig string with reversed string
        if(orig.equals(reversed)){
            System.out.println("It is palindrome");// if equals then it is palindrome.
        }
        else{
            System.out.println("Not palindrome.");
        }
    }
}
