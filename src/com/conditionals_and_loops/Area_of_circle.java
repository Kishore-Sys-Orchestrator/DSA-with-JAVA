package com.conditionals_and_loops;

import java.util.Scanner;

public class Area_of_circle {
    //formula: Pi*r*r
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = in.nextInt();
        float pi = 3.14f;
        float area = pi*r*r;
        System.out.println("The area of the circle is: " + area);
    }
}
