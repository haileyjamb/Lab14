package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;	//get input through a keyboard

public class BoundMain {	//create a main class "BoundMain

	public static void main(String[] args)	//create a main method
	{
		Scanner keyboard = new Scanner(System.in);	//create an object of Scanner class
		int num = 0;	//delcare an integer var. "num" and initialize it
		Boundary arr = new Boundary();	//create an object of Boundary class
		boolean repeat = true;	//declare a boolean "repeat" and set it to "true"
		while(repeat)	//while repeat is "true"
		{
			try
			{
				System.out.print("Enter an integer: ");	//print out the message
				num = keyboard.nextInt();	//put input in "num"
				arr.receive(num);	//go to receive w/ a var. "num"
			}
			catch(ArrayIndexOutOfBoundsException e)	//if the exception occurs
			{
				System.out.println("Invalid array index access!");	//print out the line
				repeat = false;	//set the var. "repeat" to "false"
			}
		}
		
	}
}
