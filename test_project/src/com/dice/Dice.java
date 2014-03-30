package com.dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dice {
	ArrayList names;

    public static void main(String[] args) {
	// write your code here

	    System.out.println("Enter 1 to roll the dice for one person. 2 for multiple people. 3 to simulate time to roll a \"Snakeye\".");
	    //System.out.println("");
	    Scanner input = new Scanner(System.in);						//
	    String answer = input.next();								//
			if (answer.equalsIgnoreCase("1")){						//
			float result = rand(1,6);
				System.out.println(result);
			}
			else if(answer.equalsIgnoreCase("2")){
				ArrayBuilder.main();
			}
			else if (answer.equals("3")){
				System.out.println(SnakeEyes.slover());
				main(null);
			}
	}
	public static float rand(int min, int max) {
		Random foo = new Random();
		int randomNumber = foo.nextInt(max - min) + min;
		if (randomNumber == min) {
			return min + 1;
		}
		else{return randomNumber;}
	}



}

