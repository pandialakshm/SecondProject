package firstpackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	

	public static void main(String[] args) {
		//FirstClass 

		// Print next 20 numbers from a given number 
		/*
		 * Input - 15
		 * output - 16 ... 35
		 * 
		 * 
		 * Input - 23 
		 * output - 24 ... 43
		 */
		number1();
		
	}
	
	  public static void number1() { int number=30;
	 
	 
	 
	 for (int i = number; i <= number+20; i++) { System.out.println(i);
	 
	  } }
	 
	
	}

