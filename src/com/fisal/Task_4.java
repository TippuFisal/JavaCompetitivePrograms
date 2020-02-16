package com.fisal;

/*
15-Feb-2020

Day 4 Challenge

Jack bought 400 hot dogs for the school picnic.
If they were contained in packages of 8 hot dogs,
how many total packages did he buy ?

Create a Java Program without using \ or % operator.
*/
public class Task_4 {
    static int a = 400;
    static int b = 8;
    static int c;
    public static void main(String[] args) {
        method_2();
    }

    public static void method_1(){
        System.out.println("Jack contains "+8*50+ " Packages");
    }

    public static void method_2(){
        for(int i=1;i<=i;i++){
             c = 8*i;
            if(c==a){
                System.out.println("Jack contains "+i+ " Packages");
                break;
            } else if(c>a){
                System.out.println(i-1);
                break;
            }
        }
    }

    // this method from reference
    public static void method_3(){
        int totalhotdog = 400;
        int hotDogPerContainer = 8;
        int totalContainer =0;
        int temp = totalhotdog+hotDogPerContainer;

        while (temp>hotDogPerContainer){
            temp = temp - hotDogPerContainer;
            System.out.println(temp);
            totalContainer++;
        }
        System.out.println("\n \n\n\n\n "+totalContainer);
    }
}
