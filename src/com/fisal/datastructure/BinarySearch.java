package com.fisal.datastructure;

/*
*
*
16-feb-2020
*
*
* */

public class BinarySearch {
    public static void main(String[] args) {
        method_1();
    }

    public static void method_1(){
        int value=86;
        int a[]={15,25,30,35,40,45,60,75,86};
        int fi=0;
        int li=a.length-1;
        int mi=(fi+li)/2;

        while (fi<=li){
            if(a[mi]==value){
                System.out.println("Yes its avaible in this array at index value of "+mi);
                break;
            }else if(a[mi]<value){
                fi=mi+1;
            }else{
                li=mi-1;
            }
            mi=(fi+li)/2;
        }


    }

}
