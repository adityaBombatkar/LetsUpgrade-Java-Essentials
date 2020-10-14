//Create an int array with 5 values and print only odd values.

package com.Assignment2;

public class Main {
    public static void main(String[] args){

        int num[] = {34,2,55,69,78};

        for (int i=0 ; i<num.length ; i++){
            if(num[i]%2 == 0){
                System.out.println(num[i]);
            }
        }
    }
}
