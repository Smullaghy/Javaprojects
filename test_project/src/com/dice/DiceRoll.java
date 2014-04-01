package com.dice;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Sean on 3/26/14.
 */
public class DiceRoll {
	//public static void main(String[] args) {userrolls();
		//}
	public static int rand1(int min, int max) {					//Requires to int's to be defined from another class/function
		Random foo = new Random();								//foo is a new random number
		int randomNumber = foo.nextInt(max - min) + min;		// defines the scope
		if (randomNumber == min) {								// if the number is equal to min add one
			return min + 1;										//I can do alway with this and set the scope as 1, number.
		} else {
			return (int)randomNumber;							//returns random number.
		}

	}
}

