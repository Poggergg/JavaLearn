package javatest;

import java.util.Scanner;

public class javalearn{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int eggsAmount;
		int eggsMin = 1;
		int milkAmount;
		int milkMin = 200;//millilerres
		int flourAmount;
		int flourMin = 100;//grams
		
		System.out.println("Hello");
		System.out.println("Script is starting");
		System.out.println("how many eggs do you have?");
		
		Scanner userInput;
		userInput = new Scanner(System.in);
		eggsAmount = userInput.nextInt();
		System.out.println("you have "+ eggsAmount + " eggs");
		//egg calculation
		
		System.out.println("How much milk do you have?");
		userInput = new Scanner(System.in);
		milkAmount = userInput.nextInt();
		System.out.println("you have this much " + milkAmount + " ml milk");
		//milk
		
		//flour 
		
	}
}
