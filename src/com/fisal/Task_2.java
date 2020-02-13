package com.fisal;

/*
13-Feb-2020

Day 2 Challenge

Alex wants to learn Java but his computer's semicolan (;) button is not working.
Can you help him to write his first java program while he fixes his computer ?

*/

/*
 * We can use format to print the statement
 * System.out.format(" Super");
 *
 * */

public class Task_2 {

    public static void main(String[] args) {
        printfNullMethod();
    }

    //Method 1
    public static void printfNullMethod(){
        //if conditon can count the value inside the bracket
        //if its > 0 its true
        //if its 0 then it call else part
        if(System.out.printf("Printing Without Semicolan")==null){
            //System.out.print("  done");
        }else {
            //System.out.print("  Fail");
        }
    }

    //Method 2
    public static void appendEqualsNullMethod(){
        if(System.out.append("hey").equals(null)){
            System.out.print("  done");
        }else{
            System.out.print("  Fail");
        }
    }

    //Method 3
    public static void appendEqualstooNullMethod(){
        if(System.out.append("hey")== null){
            System.out.print("  done");
        }else{
            System.out.print("  Fail");
        }
    }
}
