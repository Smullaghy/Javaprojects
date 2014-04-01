package com.dice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 88040330 on 3/31/2014.
 */
public class MultipleRolls {                                        // This is an attempt to loop the roll function and return them.

	public static void roller(int numofRolls, int sizeOfDice, String user) {
		//System.out.println("");
		int counter = 0;
		int numOfUsers;
		String storage = "";
		String headerStorage = "Roll";
		//String tempStoreageRoll = "";
		while (counter < numofRolls) {
			int roll = DiceRoll.rand1(0, sizeOfDice);
			counter++;
			String tempStoreageRoll;
			headerStorage = headerStorage + counter;

			if (roll < 10) {
				tempStoreageRoll = "0" + roll;
			} else {
				tempStoreageRoll = String.valueOf(roll);
			}
		storage = storage + tempStoreageRoll + "     ";


		}
		System.out.format("%-8s %7s\n", user, storage);
	}
}
