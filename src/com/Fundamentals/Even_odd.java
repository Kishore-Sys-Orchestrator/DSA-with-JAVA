package com.Fundamentals;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Input.nextInt();
        if(num == 0){
            System.out.println("The number is 0, neither odd nor even");
        }
        else if(num % 2 == 0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
}
