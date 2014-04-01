package com.dice;

import java.util.concurrent.locks.Condition;

/**
 * Created by Sean on 3/29/14.
 */
public class SnakeEyes {
	/*public static void main(String[] args){
	//slover();
		(System.out.println(slover());
		}*/
	float total;
	public static float slover(){
		int counter = 0;							// Counts the number of times its looped.
		float total;								//total times the loop ran until the statement became true.
		//float total;
		do {
			total=0;								//Sets the total to zero, I needed the loop to break so I set the value out there.
			float roll1 = DiceRoll.rand1(0,6);
			float roll2 = DiceRoll.rand1(0,6);
			counter++;
			total = roll1+roll2;    				//Generates the total roll, to get this to work Ive had to reset the value.
		}while (total!=2); 							//This does the loop when the total is not equal to 2.

	return counter;
	}
}
