package com.A2;
import java.util.Scanner;

public class Grade {

    public static void percetageCal(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter maths marks out of 100: ");
        double math = s.nextDouble();

        System.out.print("Enter chemistry marks out of 100: ");
        double chemistry = s.nextDouble();

        System.out.print("Enter physics marks out of 100: ");
        double physics = s.nextDouble();

        System.out.print("Enter biology marks out of 100: ");
        double biology = s.nextDouble();

        System.out.print("Enter astronomy marks out of 100: ");
        double astronomy = s.nextDouble();

        System.out.println("Math marks are: " +math);
        System.out.println("Chemistry marks are: " +chemistry);
        System.out.println("Physics marks are: " +physics);
        System.out.println("Biology marks are: " +biology);
        System.out.println("Astronomy marks are: " +astronomy);

        double totalMarks = math + biology + physics + chemistry + astronomy;
        double per = totalMarks * 100 / 500;

        System.out.println("Percentage  is : " +per+ "%");

        if(per >= 30D && per < 50D){
            System.out.println("Grade is D");
        }
        else if(per >= 50D && per < 70D){
            System.out.println("Grade is C");
        }
        else if(per >= 70D && per < 90D){
            System.out.println("Grade is B");
        }
        else if(per > 90D){
            System.out.println("Grade is A");
        }
        else
        {
            System.out.println("Something went wrong");
        }
    }
}
