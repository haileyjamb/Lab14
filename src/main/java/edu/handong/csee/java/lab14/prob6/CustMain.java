package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;	//get input through a keyboard

public class CustMain {	//create a main class

	public static void main(String[] args)	//create a main method
	{
		String name, race;	//create two strings 
		int age = 0;	//declare an integer var. "age" and initialize
		Scanner keyboard = new Scanner(System.in);	//create an object of Scanner class
		CustomID obj = new CustomID();	//create an object of CustomID class
		boolean repeat = true;	//create a boolean and initialize it to "true"
		
		while(repeat)	//while "repeate" is "true"
		{
			try {
				if(obj.getState() == 0){	//if getState returns 0
					System.out.print("Enter your name: ");	//print out the message
					name = keyboard.nextLine();	//get input (whole sentence) and put it into var. "name"	
					obj.setName(name);	//go to setName method w/ var. "name"
				}
				else if(obj.getState() == 1) {	//if getState returns 1
					System.out.print("Enter your age: ");	//print out the message
					age = keyboard.nextInt();	//get input and put it into var. "age"
					keyboard.nextLine();	//get the whole sentence 
					obj.setAge(age);	// go to setAge method w/ var. "age"
				}
				else if(obj.getState() ==2) {	//if getState returns 2
					System.out.print("Enter your race: ");	//print out the message
					race = keyboard.nextLine();	//get input (whole sentence) and put it into var. "race"
					obj.setRace(race);	//go to setRace method w/ var. "race"
				}
			}
			catch(Exception e) {	//if Exception occurs
				System.out.println(e.getMessage());//print out the message which comes w/ error event
				continue;	//continue 
			}
		}
	}
}
