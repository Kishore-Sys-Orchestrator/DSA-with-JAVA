package com.kishore;

import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ams_base = (num1 + num2);
        int ams_val = (int) Math.pow(ams_base, 2);
    }

}
