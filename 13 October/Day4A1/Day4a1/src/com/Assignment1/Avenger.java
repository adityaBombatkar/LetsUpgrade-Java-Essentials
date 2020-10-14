package com.Assignment1;
import java.util.Scanner;

public class Avenger {
    Scanner s = new Scanner(System.in);
    String name;
    int age;
    String power;
    String weapon;
    String planet;

    public void getDetails(){
        System.out.print("Enter name of Superhero: ");
        name = s.nextLine();
        s.nextLine();
        System.out.println("Enter age: ");
        age = s.nextInt();
        s.nextLine();
        System.out.println("Enter power: ");
        power = s.nextLine();
        s.nextLine();
        System.out.println("Enter Weapon: ");
        weapon = s.nextLine();
        System.out.println("Enter planet: ");
        planet = s.nextLine();
        s.nextLine();
    }
    public void displayDetails(){
        System.out.println("Name of SuperHero is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Power is: "+power);
        System.out.println("Weapon is: "+weapon);
        System.out.println("Planet is: "+planet);
    }
}
