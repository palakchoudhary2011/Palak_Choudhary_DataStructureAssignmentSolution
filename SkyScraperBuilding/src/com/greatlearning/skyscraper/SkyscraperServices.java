package com.greatlearning.skyscraper;

import java.util.Stack;

public class SkyscraperServices {

	int largestFloor = 0;
	int index = -1;
	Stack<Integer> newStack = new Stack<>();
	Stack<Integer> tempStack = new Stack<>();
	public Stack<Integer> custructBuilding(int floor, int day, int totalNoOfFloor) {
		//System.out.println("The order of construction is as follows ");
		tempStack.push(floor);
		if(newStack.isEmpty()) {
			newStack.push(floor);
		}
		else {
			if(floor > newStack.peek()) {
				if( tempStack.size() < totalNoOfFloor) {
					newStack.push(floor);
				}else {
					newStack.push(floor);
					System.out.println("Day "+ day + ": ");
					while (newStack.size()>0){
					    System.out.print( newStack.pop() + " ");
					}
				}
				
			}else if(floor < newStack.peek()) {
					int prevDay = day - 1;
					System.out.println("Day " +prevDay + ": ");
					while (newStack.size()>0){
					    System.out.print( newStack.pop() + " ");
					}
					System.out.println();
				newStack.push(floor);
			}
		}
		
		return newStack;
	}
	
	public void traverseStack(Stack<Integer> stack) {
		System.out.println("Stack : "+ newStack);
	}
	
	public void showStack() {
		System.out.println("Stack : "+ newStack);
	}
}
