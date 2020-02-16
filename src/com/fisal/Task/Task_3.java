package com.fisal.Task;

/*
14-Feb-2020

Day 3 Challenge

A chef was cooking soethng special wich required exact 200ml water but he doesn't have 200ml cup he has a 500ml cup
and a 300ml cup but that dish required exactly 200ml water.
Can you slove this problem in java /

*/

public class Task_3 {

    static int cup_500 = 500;
    static int cup_300 = 300;
    // cup need for 200 ml
    static int cup_need;
    public static void main(String[] args) {
        chef();
    }

    public static void chef(){
        cup_need = cup_500 - cup_300 ;
        //First Fill 500 ml cup and fill the 300 ml cup from cup_500
        System.out.println(cup_need +" ml Water ");
    }
}
