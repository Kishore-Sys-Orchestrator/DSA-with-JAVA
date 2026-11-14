package com.conditionals_and_loops;

import java.util.Scanner;

public class Area_of_rectangle {
    //A = length * breadth
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = in.nextInt();
        int area = l * b;
        System.out.println("The area of the rectangle = " + area);

    }
}
