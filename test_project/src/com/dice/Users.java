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
			user = input.next();
		}
		if(user.equalsIgnoreCase("exit"));{
		System.out.println("I got the names....");
		System.out.print(name);
		}

	return name;

	}


}
