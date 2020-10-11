package com.A3;
import java.util.Scanner;


public class Employee {
    Scanner sc = new Scanner(System.in);

    int c_d;
    int c_m;
    int c_y;
    int b_d;
    int b_m;
    int b_y;

    public void calAge() {

        System.out.print("Enter current day: ");
        c_d = sc.nextInt();
        System.out.print("Enter current month: ");
        c_m = sc.nextInt();
        System.out.print("Enter current year: ");
        c_y = sc.nextInt();
        System.out.print("Enter birth day: ");
        b_d = sc.nextInt();
        System.out.print("Enter birth month: ");
        b_m = sc.nextInt();
        System.out.print("Enter birth year: ");
        b_y = sc.nextInt();



        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (b_d > c_d) {
            c_m = c_m - 1;
            c_d = c_d + month[b_m - 1];
        }

        if (b_m > c_m){
            c_y = c_y - 1;
            c_m = c_m + 12;
        }

        int calDate = c_d - b_d;
        int calMonth = c_m - b_m;
        int calYear = c_y - b_y;

        System.out.println("Age is " + calYear + "Years " + calMonth + "Months " + calDate+ "Days." );

    }

    public void calTax(){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double sal = s.nextDouble();
        double tax = 0;
        double annSal = sal * 12;

        if(annSal >= 500000D){
            tax = 0.2;
//            System.out.println("");
        }
        else if(annSal >= 400000D && annSal < 500000D){
            tax = 0.15;
        }
        else if(annSal >= 300000D && annSal < 400000D){
            tax = 0.1;
        }
        else if(annSal >= 200000D && annSal < 300000D){
            tax = 0.05;
        }
        else {
            System.out.println("No tax needed.");
        }

        System.out.println("Annual Salary is :" +annSal);
        System.out.println("The tax amount is: " +(tax * annSal));
    }

}
