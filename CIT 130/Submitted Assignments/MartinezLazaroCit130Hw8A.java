/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw8A.java
@version The date as 2024-03-31
@note Time taken ~2 hours, spread out
@program this program utilizes OOP to create two classes (one for testing)
that can be used to gather, calculate and display financial information for
three customers (objects) using default data, hard-coded data and user
input data
*/

/*
IPO
Start
Import java Scanner utility
Main class
    Declare public variables
    Declare no-arg constructor
        Set default values for variables
    Declare assignData method
        Set values for variables
    Declare getTotal method
        Calculate total
        Return total
    Declare displayData method
        Display formatted data
Test class
    Declare main method
        Declare customer1 object
        Call getTotal method
        Call displayData method

        Declare customer2 object
        Call assignData method for customer2 object and pass values to it
        Call getTotal method
        Call displayData method

        Declare customer3 object
        Declare scanner object
        Get user input for customer3 variables
        Call getTotal method
        Call displayData method

        Close scanner object
End
*/

import java.util.Scanner;

public class MartinezLazaroCit130Hw8A {
    //declare public variables
    public double checking;
    public double savings;
    public double CD;
    public double balance;//total
    public String customerName;

    public MartinezLazaroCit130Hw8A() {
        checking = 0.0;
        savings = 0.0;
        CD = 0.0;
        balance = 0.0;
        customerName = "John Smith";
    }//no-arg constructor to set default values

    public void assignData(double assignChecking, double assignSavings, double assignCD, String assigncustomerName) {
        checking = assignChecking;
        savings = assignSavings;
        CD = assignCD;
        customerName = assigncustomerName;
    }//assignData method for hard coded data
    
    public double getTotal() {
        balance = checking + savings + CD;
        return balance;
    }//calculate and return total method

    public void displayData() {
        System.out.printf("Customer Name: %s\n", customerName);
        System.out.printf("Checking Account: $%.2f\n", checking);
        System.out.printf("Savings Account: $%.2f\n", savings);
        System.out.printf("CD Account: $%.2f\n", CD);
        System.out.printf("Total Balance: $%.2f\n", balance);
        System.out.println();
    }//display formatted data method

}//main class


class MartinezLazaroCit130TestHw8A {
    public static void main(String[] args) {
        //no-arg constructor
        MartinezLazaroCit130Hw8A customer1 = new MartinezLazaroCit130Hw8A();
        customer1.getTotal();
        customer1.displayData();

        //hard coded data
        MartinezLazaroCit130Hw8A customer2 = new MartinezLazaroCit130Hw8A();
        customer2.assignData(250, 10000, 45000, "Foo Bar");
        customer2.getTotal();
        customer2.displayData();

        //user input data
        MartinezLazaroCit130Hw8A customer3 = new MartinezLazaroCit130Hw8A();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        customer3.customerName = input.nextLine();
        System.out.println("Enter checking account balance:");
        customer3.checking = input.nextDouble();
        System.out.println("Enter savings account balance:");
        customer3.savings = input.nextDouble();
        System.out.println("Enter CD account balance:");
        customer3.CD = input.nextDouble();
        customer3.getTotal();
        customer3.displayData();

        input.close();//close scanner
        
    }//main
}//test class
