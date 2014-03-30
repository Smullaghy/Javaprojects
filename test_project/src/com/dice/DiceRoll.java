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
	public static int rand1(int min, int max) {
		Random foo = new Random();
		int randomNumber = foo.nextInt(max - min) + min;
		if (randomNumber == min) {
			return min + 1;
		} else {
			return (int)randomNumber;
		}

	}

	public static ArrayList<Integer> userrolls(){
	ArrayList<Integer> roll = new ArrayList<Integer>();
		int numUsers = Users.mainUsers().size();
		int counter = 0;
		int temprolls;
		do {
			temprolls = rand1(1,6);
			roll.add(temprolls);
			counter++;
		}while(numUsers>counter);
	return roll;
	}




}

