/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw4.java
@version The date as 2024-02-11
@note Time taken 2 hours
@program This program compares employees' names
and displays them in descending order with their net pay
*/

/* IPO

Start
Import Java Utility Package
Setup Scanner utility
Declare and initialize variables
Get information from user for three employees
For each employee
	Get and output employee's
        name
	    hours worked
	    hourly pay rate
	Calculate and output employees':
        gross pay
        federal tax withholding
        state tax withholding
        total deduction
	    net pay
Display employees' information in a table format
End

*/

import java.util.Scanner; // import utility package

public class MartinezLazaroCit130Hw4{
	public static void main(String[] args){

        final double fedTaxRate = .2; // declare our two constants
        final double stateTaxRate = .09;

        Scanner input = new Scanner(System.in); // setup scanner utility

        System.out.println("Enter First employee's name:"); // get user input for first employee
        String name1 = input.nextLine();
        System.out.println("Enter hours worked:");
        double hours1 = input.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double payRate1 = input.nextDouble();
        double grossPay1 = hours1 * payRate1; // calculate gross pay,
        double fedTax1 = grossPay1 * fedTaxRate; // federal tax
        double stateTax1 = grossPay1 * stateTaxRate; // state tax
        double totalDeduction1 = fedTax1 + stateTax1; // total deduction
        double netPay1 = grossPay1 - totalDeduction1; // net pay
        System.out.printf("Employee's name: %s%n", name1); // display formatted data for first employee
        System.out.printf("Hours worked: %.2f%n", hours1);
        System.out.printf("Pay rate: $%.2f%n", payRate1);
        System.out.printf("Gross pay: $%.2f%n", grossPay1);
        System.out.printf("Deductions:%n");
        System.out.printf("Federal Withholding(%.2f%%): $%.2f%n", fedTaxRate * 100, fedTax1);
        System.out.printf("State Withholding(%.1f%%): $%.2f%n", stateTaxRate * 100, stateTax1);
        System.out.printf("Total Deduction: $%.2f%n", totalDeduction1);
        System.out.printf("Net Pay: $%.2f%n", netPay1);

        input.nextLine(); // I had to look this up during debugging,
                          // without it, my program was skipping the name of the second employee

        System.out.println("Enter Second employee's name:");
        String name2 = input.nextLine();
        System.out.println("Enter hours worked:");
        double hours2 = input.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double payRate2 = input.nextDouble();
        double grossPay2 = hours2 * payRate2;
        double fedTax2 = grossPay2 * fedTaxRate;
        double stateTax2 = grossPay2 * stateTaxRate;
        double totalDeduction2 = fedTax2 + stateTax2;
        double netPay2 = grossPay2 - totalDeduction2;
        System.out.printf("Employee's name: %s%n", name2);
        System.out.printf("Hours worked: %.2f%n", hours2);
        System.out.printf("Pay rate: $%.2f%n", payRate2);
        System.out.printf("Gross pay: $%.2f%n", grossPay2);
        System.out.printf("Deductions:%n");
        System.out.printf("Federal Withholding(%.2f%%): $%.2f%n", fedTaxRate * 100, fedTax2);
        System.out.printf("State Withholding(%.1f%%): $%.2f%n", stateTaxRate * 100, stateTax2);
        System.out.printf("Total Deduction: $%.2f%n", totalDeduction2);
        System.out.printf("Net Pay: $%.2f%n", netPay2);

        input.nextLine();

        System.out.println("Enter Third employee's name:");
        String name3 = input.nextLine();
        System.out.println("Enter hours worked:");
        double hours3 = input.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double payRate3 = input.nextDouble();
        double grossPay3 = hours3 * payRate3;
        double fedTax3 = grossPay3 * fedTaxRate;
        double stateTax3 = grossPay3 * stateTaxRate;
        double totalDeduction3 = fedTax3 + stateTax3;
        double netPay3 = grossPay3 - totalDeduction3;
        System.out.printf("Employee's name: %s%n", name3);
        System.out.printf("Hours worked: %.2f%n", hours3);
        System.out.printf("Pay rate: $%.2f%n", payRate3);
        System.out.printf("Gross pay: $%.2f%n", grossPay3);
        System.out.printf("Deductions:%n");
        System.out.printf("Federal Withholding(%.2f%%): $%.2f%n", fedTaxRate * 100, fedTax3);
        System.out.printf("State Withholding(%.1f%%): $%.2f%n", stateTaxRate * 100, stateTax3);
        System.out.printf("Total Deduction: $%.2f%n", totalDeduction3);
        System.out.printf("Net Pay: $%.2f%n", netPay3);

        // sorted the names in descending order based on the first letter of the name
        // not sure why this was asked, I don't think it's been covered yet or I missed it
        // also the sample run provided does not do this but I'm going for full points
        if(name1.charAt(0) < name2.charAt(0)) {
            String tempName = name1;
            name1 = name2;
            name2 = tempName;
            double tempPay = netPay1;
            netPay1 = netPay2;
            netPay2 = tempPay;
        }
        if(name2.charAt(0) < name3.charAt(0)) {
            String tempName = name2;
            name2 = name3;
            name3 = tempName;
            double tempPay = netPay2;
            netPay2 = netPay3;
            netPay3 = tempPay;
        }
        if(name1.charAt(0) < name3.charAt(0)) {
            String tempName = name1;
            name1 = name3;
            name3 = tempName;
            double tempPay = netPay1;
            netPay1 = netPay3;
            netPay3 = tempPay;
        }

        System.out.println("Employee Name\tEmployeeNetPay"); // output acquired data in a table format
        System.out.printf("%s\t%.2f%n", name1, netPay1);
        System.out.printf("%s\t%.2f%n", name2, netPay2);
        System.out.printf("%s\t\t%.2f%n", name3, netPay3); // when running and debugging, using double tab on the last one
                                                           // was the only way I could get this to look as intended

        input.close();
        
    } // main

} // class