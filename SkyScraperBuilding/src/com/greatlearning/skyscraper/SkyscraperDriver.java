package com.greatlearning.skyscraper;

import java.util.Scanner;
import java.util.Stack;

public class SkyscraperDriver {

	static Scanner sc = new Scanner(System.in);
	static int totalNoOfFloor;
	static int floor[];
	static int finalFloor[];
	
	static Stack<Integer> newStack = new Stack<>();
	
	public static void main(String args[]) {
		
		SkyscraperServices sky = new SkyscraperServices();
		
		System.out.println("Enter total number of floor : ");
		totalNoOfFloor = sc.nextInt();
		floor = new int[totalNoOfFloor];
		int j = 0;
		for(int i = 0; i < floor.length; i++) {
			j = i+1;
			System.out.println("Enter floor size given on day " + j);
			newStack = sky.custructBuilding(sc.nextInt(), j, totalNoOfFloor);
			
		}
		
		
		
	}
	
}
