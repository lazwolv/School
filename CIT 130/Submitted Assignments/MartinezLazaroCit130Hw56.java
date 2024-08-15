/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw56.java
@version The date as 2024-03-03
@note Time taken ~3 hours, spread out
@program a simple library book management system with basic functionality to add,
display, borrow, and return books. It ensures that the user enters valid input
that if a user input a negative quantity, the program will handle it.
*/

/* IPO
Start
Import Java Scanner Utility
Setup Scanner utility globally
Declare global variables
    Declare main method variables
    While True
        Call choices method
        Get choice
        If choice is 1
            Call addBook method
        Else if choice is 2
            Call displayBook method
        Else if choice is 3
            Call borrowBook method
        Else if choice is 4
            Call returnBook method
        Else if choice is 5
            Close program with exit message
        Else
            Error message and back to choices

    choices method
        Output user a list of choices
    
    addBook method
        Get title, author first and last name, ISBN and quantity
        Format ISBN to include dashes every 3 digits
        Generate random book code number

    displayBook method
        Output formatted book information
            Include author's capitalized first and last initials

    borrowBook method
        If quantity greater than 0
            Output success message
            Deduct quantity
        Else
            Output Error message and back to choices method
            
    returnBook method
        If quantity greater than 0
            Output success message
            Increase quantity
        Else
            Output Error message and back to choices method
End
*/

import java.util.Scanner;//import scanner utility

public class MartinezLazaroCit130Hw56 {
    // setup scanner utility
    public static Scanner input = new Scanner(System.in);

    // declare variables with full class scope so they can be reused and globally updated
    static String title;
    static String authorFirstName;
    static String authorLastName;
    static int ISBN;
    static String ISBNformatted;
    static int quantity;
    static double bookCode;
    public static void main(String[] args) {
        
        boolean condition = true;//this will be our way of exiting the ongoing loop
        int choice;

        while(condition) {

            choices();

            choice = input.nextInt();

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                displayBook();
            } else if (choice == 3) {
                borrowBook();
            } else if (choice == 4) {
                returnBook();
            } else if (choice == 5) {
                System.out.println("Thank you for using the Library Book Inventory Management System.");
                condition = false;//close program with exit message
            } else {//if an invalid choice is entered output error message
                System.out.println("Invalid choice. Please try again.");
            }
            
        }//while true
        
    }//main
    
    public static void choices() {
        System.out.println("Library Book Inventory Management:");
        System.out.println("1. Add a Book");
        System.out.println("2. Display Book Information");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
    }//choices
    
    public static void addBook() {
        System.out.println("Enter title:");
        input.nextLine();//needed to flush newline character because it kept skipping title input request
        title = input.nextLine();
        System.out.println("Enter author first name:");
        authorFirstName = input.nextLine();
        System.out.println("Enter author last name:");
        authorLastName = input.nextLine();
        System.out.println("Enter Book ISBM:");
        ISBN = input.nextInt();
        ISBNformatted = ISBN + "";//convert int to string
        ISBNformatted = ISBNformatted.substring(0, 3)
            + "-" + ISBNformatted.substring(3, 6)
            + "-" + ISBNformatted.substring(6, 9);//added a dash after every three characters assuming length is 9
        System.out.println("Enter quantity:");
        quantity = input.nextInt();
        System.out.println("Book added successfully.");
        bookCode = (Math.random() * 999) + 1;//randomly generated number between 1 and 999

    }//add books

    public static void displayBook() {
        System.out.println("Book Information:");
        System.out.printf("\nBook Code Generated: %.04f\n", bookCode);//four decimal points
        System.out.printf("Title: %s\n", title);
        System.out.printf("Author First Name: %s\n", authorFirstName);
        System.out.printf("Author Last Name: %s\n", authorLastName);
        System.out.printf("Author Initials: %s.%s\n",
            Character.toUpperCase(authorFirstName.charAt(0)),
            Character.toUpperCase(authorLastName.charAt(0)));//upper case initials
        System.out.printf("ISBN: %s\n", ISBNformatted);
        System.out.printf("Quantity: %d\n", quantity);

    }//display book

    public static void borrowBook() {
        if (quantity > 0) {
            quantity --;//variable reduction
            System.out.printf("Book borrowed successfully. Remaining quantity: %d\n", quantity);
        }
        else {
            System.out.println("Insufficient quantity. Enter 0 for quantity to go back to choices.");
            quantity = input.nextInt(); //allows user to enter 0 to go back to choices.
        }
    } //borrow book
    
    public static void returnBook() {
        if (quantity > 0) {
            quantity ++;//variable increase
            System.out.printf("Book returned successfully. Updated quantity: %d\n", quantity);
        }
        else {
            System.out.println("Insufficient quantity. Enter 0 for quantity to go back to choices.");
            quantity = input.nextInt(); //allows user to enter 0 to go back to choices.
        }

    } //return book

} //class