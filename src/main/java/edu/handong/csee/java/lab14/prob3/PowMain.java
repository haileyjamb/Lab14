package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;	//get input through a keyboard

public class PowMain {	//create a main class "PowMain"

	public static final PowerCalculator my_calculator = new PowerCalculator();	//create an object of PowerCalculator class
	
	public static final Scanner in = new Scanner(System.in);	//create an object of Scanner class
	
	public static void main(String[] args)	//create a main method
	{
		while(in.hasNextInt()) {	//while a next token is an integer
			
			int n = in.nextInt();		//put an input in a var. "n"
			int p = in.nextInt();		//put an input in a var. "p"
			
			try {
				System.out.println(my_calculator.power(n, p));	//print a line the result of power method w/ arguments "n" and "p"
			}
			catch (Exception e) {	//if Exception occurs
				System.out.println(e);	//then print out the message
			}
		}
	}
}
