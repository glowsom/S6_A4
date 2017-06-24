package com.acadgild;
import java.util.Scanner;
/*
 * 
 */
public class Bank {

	public static void main(String[] args) throws BankATMException {
		/*
		 *  TODO application Bank having 3 BankAtm objects. Every time withdraw method
		 * is called on the BankAtm object the balance should be subtracted.
		 * Generate BankATMException whenever withdrawal is done
		 * for balance less than 10000.
		 */
		//3 BankAtm Objects
		BankAtm bankAtm1 = new BankAtm(120001, "ForEver Bank", "Edison, NJ" );
		BankAtm bankAtm2 = new BankAtm(120002, "ForEver Bank", "New York, NY" );
		BankAtm bankAtm3 = new BankAtm(120003, "ForEver Bank", "Dallas, TX" );
		
		//Customer is the means by which we'll get input from the customer
		Scanner customer = new Scanner(System.in);
		
		int decision;
		String begin;
		int amt;
		boolean anotherTransaction = true;
		
		//This part of the program will be iterated until customer or an exception ends it.
		do{
			System.out.println("What would you like to do now:"
					+ "\nEnter '1' to Deposit to ATM120001"
					+ "\nEnter '2' to Deposit to ATM120002"
					+ "\nEnter '3' to Deposit to ATM120003"
					+ "\n----------------------------------"
					+ "\nEnter '4' to Withdraw from ATM120001"
					+ "\nEnter '5' to Withdraw from ATM120002"
					+ "\nEnter '6' to Withdraw from ATM120003");	
			
			decision = customer.nextInt();	//Assigns the customer's bank activity decision
			
			System.out.println("How much?");
			amt = customer.nextInt();		//Assigns customer's amount to be withdrawn or deposited
			
			//BAsed on the customer's input, the appropriate switch statement will be applied.
			switch (decision){
		
			case(1): {bankAtm1.deposit(amt); break;}
			case(2): {bankAtm2.deposit(amt); break;}
			case(3): {bankAtm3.deposit(amt); break;}
			case(4): {bankAtm1.withdraw(amt); break;}
			case(5): {bankAtm2.withdraw(amt); break;}
			case(6): {bankAtm3.withdraw(amt); break;}
			
			//In case decision is not an integer within the range of 1-6 This will print
			default: System.out.println("Error! Transaction cancelled.");
			}
			
			//Customer gets to choose whether to loop again or exit.
			System.out.println("\nBegin another transaction? y or n");
			
			begin = customer.next();	//assigns customer's input
			
			//compares input and returns true if it's y/Y, which means customer wants to loop again.
			anotherTransaction = begin.equalsIgnoreCase("y"); 
			
		}while(anotherTransaction);		//determines whether to loop based on preceding boolean assignment
		
		//This code executes when customer has no more transactions to make. Express valediction.
		System.out.println("Goodbye.");
		customer.close();	//Scanner must be closed.
	}
}