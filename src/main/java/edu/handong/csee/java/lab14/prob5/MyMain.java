package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;	//get input through a keyboard

public class MyMain {	//create a main class
	public static void main(String[] args) {	//create a main method
		try {
			Scanner keyboard = new Scanner(System.in);	//create an object of Scanner class
			String str = keyboard.nextLine();	//create an object of String 
				MyMain.myTest(str);	//go to myTest method w/ "str" var. 
		}catch(MyException mae) {	//if MyException occurs
			System.out.println("Inside the catch block: " +mae);	//print out the line w/ var. "mae"
		}
	}
	static void myTest(String str) throws MyException{	//create a method that throws back to where myTest is called when MyException occurs
		if(str.equals("null")) {	//if "str" is empty
			throw new MyException("String val is null.");	//go to MyException w/ the message
		}
		else	//or else
			System.out.println("String val is: " +str);	//print out the line w/ "str"
	}
}
