/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw8A.java
@version The date as 2024-04-07
@note Time taken ~3 hours, spread out
@program this program uses OOP to create two classes (one for testing)
using no-arg and parameterized constructors, mutators, accessors, and
various methods
*/

/*
IPO
Start
Import java Scanner utility
Main class
    Declare public variables
    Declare no-arg constructor
        Set default values for variables
    Declare setAttributes method
        Set values for variables
    Declare accessor methods
    Declare mutator methods
    Declare toString method
    Declare hasAtSign method
        Check if email address contains @ symbol
        If it does, return the extension
        If it doesn't, return INVALID email address
    Declare starts with http method
        Check if email address starts with http
        If it does, return true
        If it doesn't, return false

    Test class
    Declare main method
        Setup scanner
        Declare employee object using no arg constructor
        Call toString method on employee object
        Call hasAtSign method on employee object
        If starts with http method returns true,
            Display The email address starts with http
        Else
            Display The email address does not start with http
        
        Do while true
            Prompt user for name
            If name == "q"
                Exit loop
            Else
                Prompt user for email address
                Prompt user for department
                Call setAttributes method on employee object
                Call toString method on employee object
                Call hasAtSign method on employee object
                If starts with http method returns true,
                    Display The email address starts with http
                Else
                    Display The email address does not start with http
        End Loop

        Get number of employees from user
        Declare array of employees
        Declare for loop to set attributes for each employee
            Prompt user for name
            Prompt user for email address
            Prompt user for department
            Declare new object for each employee of the array
            Call setAttributes method on employee object
            Display result of hasAtSign method for each employee
            Display result of startsWithHttp method for each employee
        End loop
        Close Scanner
End
*/

import java.util.Scanner;
public class MartinezLazaroCit130Hw8B {//Employee class
    //declare class variables
    private String name;
    private String emailAddress;
    private String department;

    //no arg constructor to set default values
    public MartinezLazaroCit130Hw8B() {
        name = "John Smith";
        emailAddress = "johnSmith@example.com";
        department = "IT";
    }

    public void setAttributes(String assignName, String assignEmailAddress, String assignDepartment) {
        name = assignName;
        emailAddress = assignEmailAddress;
        department = assignDepartment;
    }

    //accessor methods
    public String getName() {
        return name;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getDepartment() {
        return department;
    }

    //mutator methods
    public void setName(String assignName) {
        name = assignName;
    }
    public void setEmailAddress(String assignEmailAddress) {
        emailAddress = assignEmailAddress;
    }
    public void setDepartment(String assignDepartment) {
        department = assignDepartment;
    }

    //toString method
    public String toString() {
        return "Name: " + name + ", Email Address: " + emailAddress + ", Department: " + department;
    }

    //has @ symbol method
    public String hasAtSign(String emailAddress) {
        String depExtension = "";
        if (emailAddress.contains("@")){
            depExtension = "The extension is: " + emailAddress.substring(emailAddress.indexOf("@") + 1);
        } else {
            depExtension = "INVALID email address";
        }
        return depExtension;
    }

    //starts with http method
    public boolean startsWithHttp(String emailAddress) {
        if (emailAddress.startsWith("http")){
            return true;
        } else {
            return false;
        }
    }

}//utility class

class MartinezLazaroCit130TestHw8B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MartinezLazaroCit130Hw8B employee = new MartinezLazaroCit130Hw8B();
        System.out.println(employee.toString());
        System.out.println(employee.hasAtSign(employee.getEmailAddress()));
        if (employee.startsWithHttp(employee.getEmailAddress())) {
            System.out.println("The email address starts with http");
        } else {
            System.out.println("The email address does not start with http");
        }
        
        //continous loop
        boolean condition = true;
        do {
            System.out.println("Enter employee name, press q to quit: ");
            String name = input.nextLine();
            if (name.equals("q")) {
                condition = false;
            } else {
                System.out.println("Enter employee email address: ");
                String emailAddress = input.nextLine();
                System.out.println("Enter employee department: ");
                String department = input.nextLine();
                employee.setAttributes(name, emailAddress, department);
                System.out.println(employee.toString());
                System.out.println(employee.hasAtSign(emailAddress));
                if (employee.startsWithHttp(employee.getEmailAddress())) {
                    System.out.println("The email address starts with http");
                } else {
                    System.out.println("The email address does not start with http");
                }
            }
        } while (condition);

        //array of N Employee objects
        System.out.println("Enter number of employees: ");
        int n = input.nextInt();
        input.nextLine();
        MartinezLazaroCit130Hw8B[] employees = new MartinezLazaroCit130Hw8B[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name: ");
            String name = input.nextLine();
            System.out.println("Enter employee email address: ");
            String emailAddress = input.nextLine();
            System.out.println("Enter employee department: ");
            String department = input.nextLine();
            employees[i] = new MartinezLazaroCit130Hw8B();
            employees[i].setAttributes(name, emailAddress, department);
            System.out.println(employees[i].hasAtSign(emailAddress));
            if (employees[i].startsWithHttp(emailAddress)){
                System.out.println("The email address starts with http");
            } else {
                System.out.println("The email address does not start with http");
            };
        }//for loop
        input.close();//close scanner
    }//main method
}//test class