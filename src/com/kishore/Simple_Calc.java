package com.kishore;

import java.util.Scanner;

public class Simple_Calc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operator: ");
        char op = input.next().charAt(0); // JAVA dont have any nexrChar in Scanner class. So use charAt(0) to extract the first value.
        if(op != '+' && op != '-' && op != '*' && op != '/'){
            System.out.println("Please enter the valid operator");
        }
        else if(op == '+'){
            int sum = num1 + num2;
            System.out.println("The sum is " + sum);
        }
        else if(op == '-'){
            int sub;
            if(num1 > num2){
                sub = num1 - num2;
            }
            else{
                sub = num2 - num1;
            }
            System.out.println("The difference is " + sub);
        }
        else if(op == '*'){
            int mul = num1 * num2;
            System.out.println("The product is " + mul);
        }
        else{
            int div = 0;
            if(num2 == 0){
                System.out.println("cannot divide by 0");
            }
            else{
                div = num1/num2;
                System.out.println("The division is " + div);
            }

        }



    }
}
