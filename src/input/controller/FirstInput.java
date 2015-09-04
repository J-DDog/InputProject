package input.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstInput
{
	// Declaration Section
	private Scanner inputScanner;
	private int age;
	
	public FirstInput()
	{
		inputScanner = new Scanner(System.in);
		age = 0;
		
	}
	
	public void start()
	{
		questions();
		
	}
	
	private void questions()
	{
		System.out.println("Please type in your name");
		String name = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hello There " + name + ", do you like plums?");
		System.out.println("Did you type more thain one name? I am sorry, please type your full name");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is: " + fullName);
		System.out.println("My name is Java");
		System.out.println("How old are you?");
		errorCatch();
		System.out.println("You are " + age + " years old? Coool M8");
		
	}
	
	private void errorCatch()
	{
		try 
		{
			age = inputScanner.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Whah There Try again NUMBERS ONLY!!!");
			inputScanner.nextLine();
			errorCatch();
			
		}
		
	}
	
}
