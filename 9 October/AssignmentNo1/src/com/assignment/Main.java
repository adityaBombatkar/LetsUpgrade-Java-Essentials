//Create a class employee. Inside that class create three variable name,age,city.
// Also create a function to display the three variables.
// In the main function create two objects and call the function using it.


package com.assignment;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Aditya";
        emp1.age = 23;
        emp1.city = "Buldhana";
        emp1.display();

        Employee emp2 = new Employee();
        emp2.name = "Sanchit";
        emp2.age = 24;
        emp2.city = "Mumbai";
        emp2.display();
    }
}
