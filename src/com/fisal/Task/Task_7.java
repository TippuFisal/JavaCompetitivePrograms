package com.fisal.Task;

/*
18-Feb-2020

Day 7 Challenge

The City's bus system carries 1,200,000 people each day,
How many people does the bus system carry each year ?
( 1 year = 365 days )
Slove without using *,/ operator, bitwise operator or loop.

*/


public class Task_7 {
    static long bus_people = 1200000;
    static int year = 365;
    static int count;
    static long value = 0;

    static int i = 10;
    static int j = 1;
    static int k;

    public static void main(String[] args) {

        int people = 1200000;
        int year = 365;
        int peopleYear= med(people,year);
        System.out.println(peopleYear);

        method_2();
    }

    /*
    *
    *
    Basic program for Recursion to Reference
    *
    *
    **/
    public static void med1() {

        if (i > 0) {
            i = i - j;
            k++;
            med1();
        } else {
            System.out.println("count " + k);
        }
    }


    /*
     *
     *
     for knowledge Reference
     *
     *
     */
    public static void method_1() {
        try {
            if (bus_people > 0) {
                bus_people = bus_people - year;
                count++;
                method_1();
            } else {
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    /*
    *
    *
    Correct Answer
    *
    *
    * */
    public static void method_2() {
        if (year > 0) {
            value = bus_people + value;
            year--;
            method_2();
        } else {
            System.out.println(value);
        }
    }

    //reference
    public static int med(int x, int y) {

        if (y == 0) {

        }
        if (y > 0) {
            return (x + med(x, y - 1));
        }
        if(y<0){
            return -med(x,-y);
        }
        return -1;
    }


}
