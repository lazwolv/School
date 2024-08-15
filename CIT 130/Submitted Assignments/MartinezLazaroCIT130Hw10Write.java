
/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw8A.java
@version The date as 2024-04-28
@note Time taken ~3 hours, spread out
@program this program creates a text file for Grocery list names and prices
 */

import java.io.File;
import java.io.FileWriter;

public class MartinezLazaroCIT130Hw10Write {

    public static void main(String[] args) {
        try {
            File file = new File("GroceryList2.txt");
            if (file.exists()) {
                throw new Exception("File exists!");
            }

            FileWriter output = new FileWriter(file);

            output.write("Apple\t\t1.99\n");
            output.write("Butter\t\t2.99\n");
            output.write("Soap\t\t1.0\n");
            output.write("Bananas\t\t1.0\n");
            output.write("Milk\t\t2.99\n");
            output.write("Dog_Food\t\t5.99\n");

            output.close();//close file writer 

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }//catch in case of an exception (file already exists)

    }//main

}//class
