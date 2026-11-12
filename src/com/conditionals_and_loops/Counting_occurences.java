package com.conditionals_and_loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Counting_occurences {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user_input = in.next().trim();
        char[] chars = user_input.toCharArray();
      //  System.out.println(chars[0]);
        int length;
        length = chars.length;

        int count = 0;
        int i,j;
        for(i = 0 ; i < length-1 ; i++){
            for(j = 0 ; j < length ; j++){
                if(chars[i] == chars[j]){
                    count++;
                }
            }
            System.out.println("The count of " + chars[i] + " is " + count);
            count = 0;
        }


    }

}
