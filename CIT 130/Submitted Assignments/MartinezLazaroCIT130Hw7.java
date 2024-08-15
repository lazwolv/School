/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw7.java
@version The date as 2024-03-20
@note Time taken ~4 hours, spread out
@program this program gathers information on an user input amount of dealers
and calculates their commission based on their sales.
It calculates total sales, average sales and total commission for the dealership.
Then it displays the gathered and calculated information in a tabular format.
*/

/* IPO
Start
Import Java Scanner Utility
Setup Scanner utility globally
Declare class scope variables
    Main method
        Initialize arrays and their length
        Call number of dealers method
        Call gather dealers info method
        Call calculate commission method
        Call display dealers info method
    Number of dealers method
        Get number of dealers from user
        Validate number of dealers
        Return number of dealers
    Gather dealers info method
        For each dealer
            Get dealer name
            Get sales amount
            Validate sales amount > 0
            Add dealer name and sales amount to arrays
    Calculate commission method
        For each dealer
            Calculate commission based on commission rate
            Add commission to array
    Calculate total sales method
        For each dealer
            Add sales to total sales
    Calculate average sales method
        Calculate average sales
    Calculate total commission method
        For each dealer
            Add commission to total commission
    Display dealers info method
        For each dealer
            Display dealer info
        Display total sales
        Display average sales
        Display total commission
End
*/
import java.util.Scanner; //import scanner utility

public class MartinezLazaroCIT130Hw7 {
    static Scanner input = new Scanner(System.in); //setup scanner utility
    static int numDealers;
    static double totalSales;
    static double avgSales;
    static double totalCommission;
    static String[] names;
    static double[] sales;
    static double[] commission;
    static final double[] commissionRate = {0.1, 0.15, 0.2};
    public static void main(String[] args) {
        //invoke the methods we wrote
        names = new String[numDealers];
        sales = new double[numDealers];
        commission = new double[numDealers];
        numDealers = numDealers();
        dealersInfo(names, sales);
        commission = dealerCommission(sales, commissionRate);
        displayDealerInfo(names, sales, commission);
    }//main method
    
    public static int numDealers() {
        System.out.println("Enter the number of dealers: ");
        numDealers = input.nextInt();
        input.nextLine();//flush newline character
        while (numDealers <= 0 || numDealers > 20){
            System.out.println("Invalid number of dealers. Please enter a number between 1 and 20.");
            numDealers = input.nextInt();
            input.nextLine();//flush newline character
        }//validation 1-20
        return numDealers;
    }//numDealers method
    
    public static void dealersInfo(String[] names, double[] sales) {
        for (int i = 0; i < numDealers; i++) {
            System.out.println("Enter dealer name: ");
            names[i] = input.nextLine();
            do{
                System.out.println("Enter sales amount: ");
                sales[i] = input.nextDouble();
                if(sales[i] < 0){
                    System.out.println("Invalid sales amount. Please enter a positive number.");
                }
            } while (sales[i] < 0);
            input.nextLine();//flush newline character
        }//for loop
    }//dealers info method
    
    public static double[] dealerCommission(double[] sales, double[] commissionRate) {
        double[] commission = new double[sales.length];
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] > 0 && sales[i] <= 5000) {
                    commission[i] = sales[i] * commissionRate[0];//.1
                }
                else if (sales[i] > 5000 && sales[i] <= 15000) {
                    commission[i] = sales[i] * commissionRate[1];//.15
                }
                else if (sales[i] > 15000) {
                    commission[i] = sales[i] * commissionRate[2];//.2
                }
        }//for loop)
        return commission;
    }//dealerCommission method
    
    public static double totalSales(double[] sales){
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales;
    }//display total sales for dealership excluding commission

    public static double avgSales(){
        avgSales = totalSales / numDealers;
        return avgSales;
    }//display average sales for dealership excluding commission

    public static double totalCommission(double[] commission){
        for (int i = 0; i < commission.length; i++) {
            totalCommission += commission[i];
        }
        return totalCommission;
    }//display total commission for dealership
    
    public static void displayDealerInfo(String[] names, double[] sales, double[] commission){
        System.out.println("Name\tSales\tCommission");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t$%.2f\t$%.2f\n", names[i], sales[i], commission[i]);
        }
        System.out.printf("Total sales: $%.2f\n", totalSales(sales));
        System.out.printf("Average sales: $%.2f\n", avgSales());
        System.out.printf("Total commission: $%.2f\n", totalCommission(commission));
    }//displayDealerInfo method
}//class
