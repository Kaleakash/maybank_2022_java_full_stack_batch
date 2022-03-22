package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterWiseOperation {
						// exception handling 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the id");
		int id = Integer.parseInt(br.readLine());	// type castring or conversation 
		System.out.println("Plz enter the name");
		String name = br.readLine();
		System.out.println("Your id is "+id);
		System.out.println("Your name is "+name);
	}

}
