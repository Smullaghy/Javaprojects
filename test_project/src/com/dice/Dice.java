package com.dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
	    System.out.println("Enter 1 to roll the dice for one person. 2 for multiple people. 3 to simulate time to roll a \"Snakeye\".");
	    Scanner input = new Scanner(System.in);						//
	    String answer = input.next();								//
			if (answer.equalsIgnoreCase("1")){						//
			int result = DiceRoll.rand1(1,6);						//
				System.out.println(result);							//
				main(null);
			}
			else if(answer.equalsIgnoreCase("2")){					//
				ArrayBuilder.main();								// goes to the arraybuilder class.
			}
			else if (answer.equals("3")){							//when the user enters three it runs
				System.out.println(SnakeEyes.slover());				// the snakeeye class and returns the number of times it ran.
				main(null);											//returns to the main void with a null value.
			}
	        else if (answer.equalsIgnoreCase("exit")){				//User can close the program when they type exit.
				System.out.close();									//
			}
	    else{
				System.out.println("Please Enter a valid choice."); // when the user enters a non-accepted choice returns them to main.
				main(null);
			}
	}
}

