package com.fisal;
/*
12-Feb-2020

Day 1 Challenge

There was a teacher in small town who loves coding and he wants to create a program which
prints out te whole multiplication table of an entered number for his students,
can you help him to write a program in java ?

*/

import java.util.Scanner;

public class Task_1 {
    static int input_1;
    static int input_2;

    public static void main(String [] args) {
        gettngInputFromUser();
        multiplication();
    }

    public static void gettngInputFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Multiplication");
        input_1 = sc.nextInt();
        System.out.println("Enter the limit of Table for Multipliation");
        input_2  = sc.nextInt();
    }

    public static void multiplication() {
        if (input_1 > 0) {
            for (int i = 0; i <= input_2; i++) {
                for (int j = i; j == i; j++) {
                    int value = input_1 * j;
                    System.out.println(input_1+" * "+i+ " = " +value);
                }
            }
        }
    }
}