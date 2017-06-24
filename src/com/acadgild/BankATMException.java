package com.acadgild;

/*
 * Create a user defined exception class BankATMException class that will be 
 * created whenever withdrawal is done for balance less than 10000.
 */
public class BankATMException extends Exception{
	/**
	 * Serializable class requires a static final serialVersionUID field of type long
	 * generated the ID with the help of eclipse IDE.
	 */
	private static final long serialVersionUID = -8053450216715511590L;

	@Override
	//If exception isn't caught, this message will be shown.
	public String getMessage (){
		return super.getMessage()+" ATM Balance is less than $10,000.";
	}
}