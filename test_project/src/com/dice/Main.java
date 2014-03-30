package com.dice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

	    System.out.println("Hello User what would you like to do?");	//This is mostly a place holder if I add non
	    System.out.println("Enter 1 for dice roller.");					// Dice related things.
	    Scanner input = new Scanner(System.in);
	    int answer = input.nextInt();
	    if (input.equals(1)){
		Dice.main(null);
	    }
    }
}
