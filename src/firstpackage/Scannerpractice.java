package firstpackage;

import java.sql.Date;
import java.util.Scanner;

public class Scannerpractice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datatype();
		Scanner Scann=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String Name = Scann.next();
		System.out.println("You have entered your name");
		System.out.print("Enter your Float number: ");
		float floatt = Scann.nextFloat();
		System.out.println("You have entered your float");
		System.out.print("Enter your Double Datatype number: ");
		Double Double = Scann.nextDouble();
		System.out.println("You have entered your Double Data type");
		System.out.print("Enter your boolean: ");
		boolean boolean1 = Scann.nextBoolean();
		System.out.println("You have entered your boolean");
		}
	
	public static void datatype(){
Scanner Scann=new Scanner(System.in);
System.out.print("Enter a number: ");
int number = Scann.nextInt();
System.out.println("You have entered Interger");

	}

	}


