package com.conditionals_and_loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String num = in.next().trim();
        char[] chars = num.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(chars);
        System.out.println("The reversed value is: " + reversed);


    }
}
