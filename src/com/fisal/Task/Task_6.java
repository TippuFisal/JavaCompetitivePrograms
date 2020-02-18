package com.fisal.Task;

import java.util.Scanner;

/*
18-Feb-2020

Day 6 Challenge
A FLoppy disk shows f bytes free and u bytes used. If you delete a file of size o bytes
and create a new file of size n bytes, how many free bytes will the floppy disk have ?
f u o and n are user entered value.

*/

public class Task_6 {
    static int userInput;
    static int cont;
    static int value_1;
    static int i=1;
    public static void main(String[] args) {
        method_2();
    }
// Correct Answer Refered...
    public static void method_2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Disk Space");
        int diskSpace = input.nextInt();//100
        System.out.println("Enter Used Space");
        int used = input.nextInt();//50
        System.out.println("Delete a file of Size");
        int delete = input.nextInt();//5
        System.out.println("Create a File of Size");
        int create = input.nextInt();//10
        int usedSpace = (used+create)-delete;
        int freeSpace = diskSpace-usedSpace;
        System.out.println("Used Space are "+usedSpace);
        System.out.println("Free Spaced are "+freeSpace);


    }

    public static void method_3(){
        int disk = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Created Value");
        int cre = scanner.nextInt();
        System.out.println("Enter Deleted Value");
        int dlt = scanner.nextInt();
        int used = (cre-dlt);
        System.out.println("Used space are "+used);
        int free = disk-used;
        System.out.println("Free Space are "+ free);
    }

}
