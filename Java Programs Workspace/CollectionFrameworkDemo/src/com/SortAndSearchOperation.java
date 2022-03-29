package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAndSearchOperation {

	public static void main(String[] args) {
		String listOfNames[]= {"Dinesh","Ajay","Vijay","Mahesh"};
		System.out.println("For each loop or enahced loop - Before sort");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		Arrays.sort(listOfNames);					// primitive array can be integer, string, float or double 
		//System.out.println("Search "+Arrays.binarySearch(listOfNames, "Ravi"));
		//System.out.println("Search "+Arrays.binarySearch(listOfNames, "Ajay"));
		if(Arrays.binarySearch(listOfNames, "Vikash")>=0) {
			System.out.println("Name present");
		}else {
			System.out.println("Name not present");
		}
		
		System.out.println("After sorting ");
		for(String name:listOfNames) {
			System.out.println(name);
		}
		
		ArrayList<String> listOfNames1 = new ArrayList<String>();
		listOfNames1.add("Dinesh");
		listOfNames1.add("Ajay");
		listOfNames1.add("Vijay");
		listOfNames1.add("Mahesh");
		System.out.println("For each loop for ArrayList before sort");
		for(String name:listOfNames1) {
			System.out.println(name);
		}
		Collections.sort(listOfNames1);					// list of array 
		System.out.println("After sort");
		for(String name:listOfNames1) {
			System.out.println(name);
		}
	}

}
