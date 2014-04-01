package com.dice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 88040330 on 3/31/2014.
 */
public class MultipleRolls {                                // This is an attempt to loop the roll function and return them.

	public static void roller(int numofRolls, int sizeOfDice, String user) {
		//System.out.println("");
		int counter = 0;									//counts the number of times loop has been ran.
		String storage = "";								//Stores the users roll value.

		while (counter < numofRolls) {						//compares how many times program has looped vs the number the user selected.
			int roll = DiceRoll.rand1(0, sizeOfDice);
			counter++;
			String tempStoreageRoll;						//Temp string for the roll, it will be added now
			if (roll < 10) {								// if the roll is less then 10
				tempStoreageRoll = "0" + roll;				// it will add a 0 to the int ex roll of 5 would be 05
			} else {
				tempStoreageRoll = String.valueOf(roll);	//if the roll was not <10 then it leaves it alone.
			}
		storage = storage + tempStoreageRoll + "     ";		// Adds the tempStorageRoll(User's Roll) to storage.
															//this loops until the function is done.

		}
		System.out.format("%-8s %7s\n", user, storage);
	}
}
