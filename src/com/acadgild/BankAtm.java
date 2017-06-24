package com.acadgild;

/*
*Create 
*/
public class BankAtm{
	private int atmId;
	private String bankName;
	private String location;
	private double balance = 12000.00;   
	
	BankAtm (int atmId, String bankName, String location){
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
	}
	
	/*
	 * The withdraw method should check the available balance in the ATM 
	 * before deducting the amount from the balance. 
	 * 
	 * If the balance is less than 10000 the withdrawal should not be allowed
	 * and a user-defined exception BankATMException should be thrown.
	 * 
	 * The withdrawal should also not be allowed if the amount to be withdrawn
	 * is greater than balance.
	 */
	void withdraw(double amt) throws BankATMException {

		//If balance is less than 10000, then throw Exception
		if(this.balance < 10000)
			throw new BankATMException();
		
		if(amt > this.balance){
			//Message for customer 
			System.out.println("Withdrawal amount excedes ATM Balance.");
			return; //Exit the method if balance is less than withdrawal amount.
		}
		
		//Decrease Balance by amount if there's no exception
		this.balance -= amt;
		System.out.println("Withdrawal Completed! \n"+this);
	}
	
	
	//Always increase balance by amount when this method is called.
	void deposit(double amt){
		this.balance += amt;
		System.out.println("Deposit Completed! \n"+this);
	}
	
	@Override
	public String toString(){
		return bankName+ " appreciates you doing business with us."
	+ "\nWe are happy to serve you via ATM"+atmId+ " in "+location+".";
	}
}

