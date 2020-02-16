package com.fisal.datastructure;

public class BubbleSort {

    public static void main(String[] args) {
        method_2();
    }

  /*
   *
    Integer Bubble Sort
   *
   */

  public static void method_1() {
        int a[]={5,3,4,1,2};
        int temp;
        int flag =0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag =1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for (int u=0;u<a.length;u++){
            System.out.print(a[u]+"  ");
        }
    }

    /*
     *
      String Bubble Sort
     *
     */
    public static void method_2(){
        String names[] = {"tippu","fisal","sheriff","rehman","aymaan","zara"};
        String temporary;
        for (int x = 0;x<names.length;x++){
            int flagValue=0;
            for (int y=0;y<names.length-1-x;y++){
                if(names[y].compareTo(names[y+1])>0){
                    temporary = names[y];
                    names[y]=names[y+1];
                    names[y+1]=temporary;
                    flagValue=1;
                }
            }
            if(flagValue==0){
                break;
            }
        }
        for (int x=0;x<names.length;x++){
            System.out.println(names[x]);
        }
    }
}
