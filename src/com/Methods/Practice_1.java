package com.Methods;

public class Practice_1 {
    public static void main(String[] args){
        int sqr = square(2);
        System.out.println("The square of the given number is = " + sqr);
        String name = getFullName("Kishore B");
        System.out.println(name);
        printWelcome();
    }

    public static int square(int num) {
        int s = num * num;
        return s;

    }
    public static String getFullName(String name){
        return name;
    }
    public static void printWelcome(){
        System.out.println("Welcome to Java Methods");
    }



}
