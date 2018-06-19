package edu.handong.csee.java.lab14.prob4;

public class Boundary {	//create a class "Boundary"

	private static int [] arr = new int [5];	//create an integer array "arr"
	private static int cnt = 0;	//declare an integer var. "cnt" and initialize it
	
	public void receive(int num)throws ArrayIndexOutOfBoundsException	//create a method "receive" if the exception occurs, then go to where "receive" is called. 
	{
		int i = cnt;	//put "cnt" in integer var. "i"
		arr[i] = num;	//"i" is an index of "arr". put num in the array 
		cnt++;	//increase "cnt" by 1
		System.out.printf("arr[%d] <- %d\n", i, num);	//print out the message w/ "i" and " num"
	}
}
