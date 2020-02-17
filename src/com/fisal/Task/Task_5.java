package com.fisal.Task;

/*
16-Feb-2020

Day 5 Challenge

During the last week of track training,
Shoshanna achieves the following times in second round: 66,57,54,53,64,52 and 59.
Found her best score use bubble sort.
*/

public class Task_5 {
   static int shoshanna [] = {66,57,54,53,64,52,59};

    public static void main(String[] args) {
        method_2();
    }

    public static void method_1(){
        int temp;

       for(int i =0;i<shoshanna.length;i++){
           int flag=0;
           for (int j=0;j<shoshanna.length-1-i;j++){
               if(shoshanna[j]>shoshanna[j+1]){
                 temp = shoshanna[j];
                 shoshanna[j] =shoshanna[j+1];
                 shoshanna[j+1]= temp;
                 flag =1;
               }
               if(flag == 0){
                   break;
               }
           }
       }
        System.out.println("Highest Second of Shoshanna : "+shoshanna[shoshanna.length-1]);
    }


    //This method used in reference
    public static void method_2(){
        int temporary=0;
        for(int x=0;x<shoshanna.length;x++){
            int flag_value=0;
            for (int y=1;y<shoshanna.length-1;y++){
                if(shoshanna[y-1]>shoshanna[y]){
                    temporary = shoshanna[y-1];
                    shoshanna[y-1]=shoshanna[y];
                    shoshanna[y]=temporary;
                    flag_value=1;
                }
            }
            if (flag_value==0){
                break;
            }
        }
            System.out.println("Best score is "+shoshanna[0]);
    }

}
