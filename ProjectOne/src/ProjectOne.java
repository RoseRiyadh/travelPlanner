import java.util.Scanner;
import java.util.*;
public class ProjectOne {
	/*
	 * This project is only a series of linear questions about planning a trip.
	 * It will help calculating the budget you need for your trip with the
	 * specific currency of the desired country based on your inputs.
	 * It will help calculating the time differences between your country and
	 * the desired one.
	 * SIMPLE project to manipulate data and having fun while learning from
	 * zero .
	 */

	public static void main(String[] args) {
		//gathering all methods together with organization.
		Scanner input = new Scanner(System.in);
		greeting(input);
		stars();
		timeAndMoney(input);
		stars();
		hours(input);
		stars();
		ending();
		
	}
	public static void stars() {
		/**
		 * Only prints some asterisks on the screen to separate a paragraph and
		 * another.
		 * @param void - This method doesn't take a parameter .
		 * @return void -  This method doesn't return anything.
		 */
		System.out.println("\n * * * * * * * *\n");
	}
	public static void greeting (Scanner input) {
		/**
		 * We are going to ask the user about few basic information about their names
		 * and the place they want to go to.
		 * @param input - Scanner to take the user's input.
		 * @return void - This method doesn't return anything.
		 */
		System.out.println("Welcome to Vacation Planner!");
		space();
		System.out.print("What's your name?  ");
		String name = input.nextLine();
		space();
		System.out.print("Nice to meet you "+name+", where are you travelling to?  ");
		String city = input.nextLine();
		space();
		System.out.println("Great! " + city + " sounds like a great trip!");
	}
	public static void timeAndMoney (Scanner input) {
		/**
		 * 
		 * @param input - Scanner to take the user's input.
		 * @return void - This method doesn't return anything.
		 */
		System.out.print("How many days are you going to spend travelling?  ");
		int days = input.nextInt();
		space();
		System.out.print("How much money, in USD, are you planning to spend on your trip?  ");
		float moneyUSD = input.nextFloat();
		moneyUSD = roundin(moneyUSD);
		space();
		System.out.print("What is the three letter currency symbol for your travel destination?  ");
		String currency = input.next();
		space();
		System.out.print("How many "+currency+" are there in 1 USD?  ");
		float currNum = input.nextFloat();
		currNum = roundin(currNum);
		float moneyUSDperDay = moneyUSD /(float) days;
		moneyUSDperDay = roundin(moneyUSDperDay);
		float currMoney = moneyUSD * currNum ;
		float currMoneyD = moneyUSDperDay * currNum ;
		space();
		System.out.println("If you are travellinng for "+days+" days that is the same as "+(days*24) +" hours or "+ (days*24*60)+" minutes.");
		space();	
		System.out.println("If you're going to spend "+ moneyUSD +"$ then this means you can spend up to "+moneyUSDperDay+"$ a day.");
		space();
		System.out.println("Your total budget in "+currency+" is "+ currMoney+" "+currency+", which is "+currMoney+" "+currency+" per day.");
		space();
		
		
		
		
	}
	public static void hours(Scanner input) {
		/**
		 * Calculating the difference time between your home and the 
		 * destination area.
		 * @param input - Scanner to take the user's input.
		 * @return void - This method doesn't return anything.
		 */
		System.out.print("What's the time difference, in hours, between your home and your destination?  ");
		int time = input.nextInt();
		space();
		int timeAtNoon =time;
		if(time<0) {
			time = 24 + time ;
		
		}
		System.out.println("That means when it is midnight at home it will be "+time+":00 in your travel destination.");
		space();
		
		System.out.println("and when it is noon at home it will be "+(timeAtNoon+12)+":00");
		space();
	}
	public static void ending() {
		/**
		 * 
		 * @param void - This method doesn't take any parameter.
		 * @return void - This method doesn't return anything.
		 */
		System.out.println(" I wish you a happy trip !! :) Don't forget to take pictures.");
		
	}
	public static float roundin (float num) {
		/**
		 * We will reduce the decimal places to 2 places after the decimal
		 * points , so the user won't have to think about the extra numbers
		 * @param num - Float number we want to manipulate the number of decimal 
		 * places of.
		 * @return rNum - Float number after being manipulated . 
		 */
		float rNum = (float) Math.round(num *100)/100 ;
		return rNum;
		
	}
	public static void space () {
		/**
		 * puts up spaces for god sakes read the name of the method yo idiot xD.
		 */
		System.out.println();
	}
}
