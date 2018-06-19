package edu.handong.csee.java.lab14.prob2;

import java.util.*;	//use all the classes in the java.util.---
import java.util.Scanner;	//get input through a keyboard

public class InException {	//create a class "InException"

	private int x =0, y = 0;	//declare an integer "x" and "y" and initialize them
	
	public void handler()	//create a method "handler"
	{
		try {	
			Scanner keyboard = new Scanner(System.in);	//create an object of Scanner class
			System.out.print("x: ");	//print out the message
			x = keyboard.nextInt();		//get input and put it in the integer var. "x"
			System.out.print("y: ");	//print out the message
			y = keyboard.nextInt();		//get input and put it in the integer var. "y"
			System.out.println(this.x/this.y);	//print out the result of division "x/y"
		}
		catch(ArithmeticException e) {	//if Arithmetic Exception occurs
			System.out.println("java.Lang.Arithmetic Exception: " + e.getMessage());	//print out a line w/ the message
		}
		catch(InputMismatchException e) {	//if Input Mismatch Exception occurs
			System.out.println("java.util.Input Mismatch Exception: ");	//print out a line w/ the message
		}
		catch(Exception e) {	//if Exception occurs
			System.out.println("Some other exception has occurred: " + e.getMessage());	//print out a line w/ the message
		}
	}
}
