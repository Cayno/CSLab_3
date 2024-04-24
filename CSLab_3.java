// Name: Connor Sterbenz
// Date: 4/23/24
// Class: CS 145 F-F 9:30 AM
// Assignment: Lab 3
// Purpose: Provides an interactive interface for users to calculate gross sales, commission rate, base salary, and total earnings. Program uses 3 classes. 
// Citation: Deitel / Deitel, W3Schools

import java.util.Scanner;

public class CSLab_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object
        int x = 0; // initialize do while 
        do {   
            run(input, x);
            System.out.println("Again? (y/n)"); // prompt to run again
            String reply = input.next().toLowerCase();
            if (reply.charAt(0) == 'n') { // end loop if user response starts with character "n"
                System.out.println("Goodbye!");
                x++; 
            }      
        } while (x < 1);
        input.close(); // close scanner object
    } // end main

    public static void run(Scanner input, int x) {
        System.out.println("Enter first name: "); // prompt user for first name
        String firstName = input.next();
        System.out.println("Enter last name: "); // prompt user for last name
        String lastName = input.next();
        System.out.println("Enter SSN (xxx-xx-xxxx): "); // prompt user for SSN
        String socialSecurityNumber = input.next();
        System.out.println("Enter Gross Sales: "); // prompt user for gross sales
        double grossSales = input.nextDouble();
        System.out.println("Enter Commission Rate (0.0 - 1.0): "); // prompt user for gross sales
        double commissionRate = input.nextDouble();
        System.out.println("Enter Base Salary: "); // prompt user for gross sales
        double baseSalary = input.nextDouble();
        
        TotalPay employeeTotal = new TotalPay(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary); // create CommissionPay object
        System.out.println("-----------------------"); // formatting     
        System.out.println(employeeTotal.toString());
        System.out.println("-----------------------"); // formatting 
    }
}