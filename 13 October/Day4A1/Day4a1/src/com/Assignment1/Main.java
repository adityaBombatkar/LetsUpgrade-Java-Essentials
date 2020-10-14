//Create a class Avenger
// with properties (name,age,power,weapon,planet) and
// with functions-getDetails() and displayDetails().
//Create 5 objects as an array in the main method and call.


package com.Assignment1;

public class Main {
    public static void main(String[] args){

        Avenger[] a = new Avenger[5];

        for(int i=0 ; i<5 ; i++){
            a[i] = new Avenger();
        }

        for(int i=0 ; i<5 ; i++){
            a[i].getDetails();
        }

        for(int i=0 ; i<5 ; i++){
            a[i].displayDetails();
        }
    }
}
