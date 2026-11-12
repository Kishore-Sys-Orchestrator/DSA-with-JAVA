package com.Fundamentals;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms do you want: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        if(n == 0){
            System.out.println("0 terms");
        }
        else if(n == 1){
            System.out.println(a);
        }
        else if(n >= 2){
            //System.out.println(a);
            //System.out.println(b);
            int count = 2;
            int c = 0;
            while(count <= n){
                c = a + b;
                a = b;
                b = c;
                //System.out.println(c);  //This will print the series of numbers
                count++;
            }
            System.out.println(c); //This will print the number at the Nth term given
        }
    }
}
