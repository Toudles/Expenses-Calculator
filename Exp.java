/* Name: [Andrew Park] NetdID: [ap6905]
Course: [CSCI-UA 101]
Description: [Expenses calculator]
Date: [9/21/2023]
*/

//import the scanner class//
import java.util.Scanner;

public class Exp {
	public static void main(String[] args) {
		
		//Create a scanner object//
		Scanner expenses = new Scanner(System.in);
		System.out.println("Enter 5 of your expenses: ");
		
		//Read the user input//
		double exp1 = expenses.nextDouble();
		
		double exp2 = expenses.nextDouble();
		
		double exp3 = expenses.nextDouble();
		
		double exp4 = expenses.nextDouble();
		
		double exp5 = expenses.nextDouble();
		
		//print the user's input//
		System.out.println("Expense #1 is " + exp1);
		System.out.println("Expense #2 is " + exp2);
		System.out.println("Expense #3 is " + exp3);
		System.out.println("Expense #4 is " + exp4);
		System.out.println("Expense #5 is " + exp5);
		
		double total = (exp1 + exp2 + exp3 + exp4 + exp5);
		System.out.println("Your total is " + total);
		
		//calculate average//
		double average = ((exp1 + exp2 + exp3 + exp4 + exp5)/5);
		System.out.println("Your average is " + average);
		
	}
}
