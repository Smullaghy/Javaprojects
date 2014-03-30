package com.dice;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Sean on 3/26/14.
 */
public class Users {
/*	public static void main(String[] args) {mainUsers();

	}*/

	public static ArrayList<String> mainUsers(){
		System.out.println("Please Enter some names. type exit when you are complete.");
		ArrayList<String> name = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String user = input.next();
		while (!user.equals("exit")){
			name.add(user);
			user = input.next();						// Input.next is defined when the user presses enter. its
		}												// A function of System.scanner.
		if(user.equalsIgnoreCase("exit")){				// When the user however types "exit" it will return the names
		}												// In a array.
	else{
			user = input.next();
		}
	return name;

	}


}
