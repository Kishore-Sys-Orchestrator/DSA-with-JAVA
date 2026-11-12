package com.kishore;

import java.util.Scanner;

public class Currency_to_USD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money in rupees: ");
        float money =input.nextFloat();
        float USD = money * 0.0106f;
        System.out.println("The USD equivalent is: " + USD);

    }
}
