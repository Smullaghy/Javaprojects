package com.dice;
import java.sql.Array;
import java.util.*;

/**
 * Created by Sean on 3/26/14.
 */
public class ArrayBuilder {
	//public static void main(String[] args) {userrolls();


	//List<List<String>> table = new ArrayList<List<String>>();
	//ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();


public static void main(){

	ArrayList usr = Users.mainUsers();										//This calls the The user class and sets a Local VAR as usr
	int counter = 0;														//Counter is used to keep track of how many times the loop ran.
	int arraySize = usr.size();												// Gets How many entries the Name Array has.
	try {
		while (arraySize>(counter-1)) {										//Compares the  to the counter to the size of the array.
			String user = (String) usr.get(counter); 						//it gets the User who is stored in this part of the array. It uses
			System.out.printf( "%-8s %5.2f\n" ,user, Dice.rand(1,6)); 		//Prints
			counter++;														// Adds +1 to the counter value.

		}

	}catch(Exception e){}													//The program will call a Exception when it reaches the end of the
																			//Array so when it catches the error it doesn't do anything with it.
	Dice.main(null);														// Returns you to the main dice class.
}
}


