/*
import java.io.File;
import java.io.IOException;
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw8A.java
@version The date as 2024-04-28
@note Time taken 1.5 hours
@program this program reads from a text file for Grocery list name and prices
calculates total before and after tax
*/

import java.io.File;
import java.util.Scanner;

public class MartinezLazaroCIT130Hw10Read {
    public static void main(String[] args) {
        try {
            File file = new File("GroceryList2.txt");
            if (!file.exists()) {
                throw new Exception("File does not exist!");
            }

            Scanner input = new Scanner(file);//create new file scanner
            double total = 0;//declare total variable

            while (input.hasNext()) {
                String item = input.next();
                double price = input.nextDouble();
                System.out.println(item + "\t\t" + price);
                total += price;//total accumulation
            }//while

            input.close();//close scanner

            final double taxRate = 0.07;//declare variable
            double afterTax = (total * taxRate) + total;//calculate total with tax rate included

            System.out.printf("Total amount before tax is: $%.2f\n", total);
            System.out.printf("Amount after (7.0%%) tax is: $%.2f\n", afterTax);//I had so much trouble with this line because it was giving me a 'conversion error'
            //it took me like 30-60 minutes to notice that the % symbol inside (7.0%) wasn't being handled properly. I love coding ugh! 
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }//catch in case of an exception (file doesn't exist)

    }//main

}//class