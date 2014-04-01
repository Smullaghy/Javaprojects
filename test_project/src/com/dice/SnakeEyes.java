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
		int counter = 0;		// Counts the number of times its looped.
		float total;
		//float total;
		do {

			total=0;		//Sets the total to zero, I needed the loop to break so I set the value out there.
			float roll1 = DiceRoll.rand1(0,6);
			float roll2 = DiceRoll.rand1(0,6);
			counter++;
			total = roll1+roll2;    				//Generates the total roll, to get this to work Ive had to reset the value.
			//System.out.println(roll1 + "roll1");
			//System.out.println(roll2 + "roll2");
			//System.out.println(total + "This is the rolls total");
			//System.out.println(counter);
			//return total;
			/*	if (total!=2){
					System.out.println("Hey it works!!");
					total=0;

				}
			else {
					total=2;
				}*/
		}while (total!=2); //This does the loop when the total is not equal to 2.
	//System.out.println(counter);
	return counter;
	}
}
