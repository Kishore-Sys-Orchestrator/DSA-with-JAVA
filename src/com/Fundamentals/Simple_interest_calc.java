package com.Fundamentals;

import java.util.Scanner;

public class Simple_interest_calc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal amount P: ");
        float P = input.nextFloat();
        System.out.print("Enter the Rate R: ");
        float R = input.nextFloat();
        System.out.print("Enter the Time T: ");
        float T = input.nextFloat();

        //SI formula P*R*T/100
        //CI formula is A = P(1+R/100)^r
        //CI = A - P

        float SI = (P*R*T)/100;
        System.out.println("The SI is: " + SI);


    }
}
