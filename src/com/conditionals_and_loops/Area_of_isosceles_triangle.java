package com.conditionals_and_loops;

import java.util.Scanner;

public class Area_of_isosceles_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = in.nextInt();
        float area = 0.5f * b * h;
        System.out.println("The area od the isosceles triangle = " + area);

    }
}
