package com.Fundamentals;

import java.util.Scanner;

public class Simple_Calc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int ans = 0;
        while(true) {
            //input valid operator
            System.out.print("Enter the operator: ");
            char op = input.next().charAt(0); // JAVA dont have any nexrChar in Scanner class. So use charAt(0) to extract the first value.

            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.print("Enter two numbers: ");
                //input two numbers
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                System.out.println(ans);
            }
            //Exit condition is pressing x or X
            else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operation!!");
            }
        }

    }
}
