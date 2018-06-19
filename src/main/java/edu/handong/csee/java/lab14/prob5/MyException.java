package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception {	//create a MyException class that inherits Exception

	private String message = null;	//create a string "message" and initialize it
	
	public MyException(String message)	//create a method
	{
		super(message); //call a parent that receives argument "message"
		this.message = message;	//var. "message" is equal to the argument var. "message"
	}
	public MyException(Throwable cause)	//create a method w/ an argument "cause"
	{
		super(cause);	//call a parent that receives argument "cause"
	}
	public String toString()	//create a method 
	{
		return message;	//return the "message"
	}
}
