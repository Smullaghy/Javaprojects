package com.dice;
import java.sql.Array;
import java.util.*;

/**
 * Created by Sean on 3/26/14.
 */
public class ArrayBuilder {
	//public static void main(String[] args) {userrolls();


	//List<List<String>> table = new ArrayList<List<String>>();
	//ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();


public static void main(){

	ArrayList usr = Users.mainUsers();
	ArrayList rolls = DiceRoll.userrolls();

	ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();
	al.addAll(usr);
	al.addAll(rolls);
	System.out.println("from Arraybuilder!");
	System.out.println(al);



}

}

