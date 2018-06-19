package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiter {	//create a SpeedLimiter class
	private int speed = 0;	//declare an integer var.
	private int limit = 0;	//declare an integer var.
	
	public void speedLimiter(int limit, int speed)	//crate a speedLimiter method w/ integer arguments
	{
		this.limit = limit;	//properties of var. "limit" is equal to parameter double "limit"
		this.speed = speed;	//properties of var. "speed" is equal to parameter double "speed"
	}

	public void warnSpeedLimit()	//create a warnSpeedLimit method
	{
		try {
			if(this.speed > this.limit)	//if "speed" is bigger than "limit"
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");	//print the message w/ "limit"
			}
			System.out.println("You are a law abiding citizen!");	//else, print out the message
		}catch(Exception e) {	//when Exception is occured
			System.out.println(e.getMessage());	//print out the message that comes w/ an error event
			System.out.println("You are being fined. ");	//print out the message
		}
		System.out.println("Your current speed: " + this.speed);	//print out the message w/ "speed"
	}

}
