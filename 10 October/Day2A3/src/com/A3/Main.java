//Take employee name, date of birth, month of birth, birth year, monthly salary;
//        5lpa - 20%;
//        4lpa - 15%;
//        3lpa- 10%;
//        2lpa -5%;
//Display name, age, annual income and the tax amount.

package com.A3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String e_name = s.nextLine();

//        Employee.calAge();
//        Employee.calTax();

        Employee e = new Employee();
        e.calAge();
        System.out.println("Employee name is "+ e_name);
        e.calTax();


    }

}
