package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;	//get input by a keyboard
import java.util.Random;	//get random numbers

public class SpeedMain {	//create a main class

	public static void main(String[] args) {	//create a main method
		Scanner keyboard = new Scanner(System.in);	//create an object of Scanner class to get input by a keyboard
		Random rand = new Random();	//create an object of Random class to get random numbers
		int limit = 0, speed = 0;	//declare two integers "limit" and "speed"
		
		System.out.print("Set the speed limit, officer: ");	//print out a message
		limit = keyboard.nextInt();	//put an input into an integer var. "limit"
		speed = rand.nextInt(101);	//put a random number created by Random class into an integer var. "speed"

		speedLimiter lim = new speedLimiter(limit, speed);	//create an object of speedLimiter

		lim.warnSpeedLimit();	//go to warnSpeedLimit method w/ an object "lim"

		keyboard.close();	//close the keyboard. input is no longer needed

	}

}
