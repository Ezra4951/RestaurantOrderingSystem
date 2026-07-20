package test;

import java.util.Scanner;

public class Calc {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String op = "";
		while (true) {
			System.out.println("===WELCOME TO MY BASIC CALCULATOR===");
			System.out.println("Type cancel if you want to exit!!!");
			System.out.print("Enter Operator [+, -, *, /, %]: ");
			op = input.nextLine();
			
			 if (op.equalsIgnoreCase("cancel")) {
				 System.out.println("Calculator Cancelled.... EXITING CALCULATOR! TRY AGAIN!!");
				 return;
			 } if (op.matches("[0-9]+")) {
				 System.out.println("ERROR!!!!! PLSS USE OPERATOR NOT NUMBER!!!!");
				 continue;
			 } if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
				 break;
			 }
			 System.out.println("Invalid operator. Please use +, -, *, /, or %.");
		}
		
		System.out.print("Enter your First Number: ");
		double num = input.nextFloat();
		
		
		System.out.print("Enter your Second Number: ");
		double num2 = input.nextFloat();
		
		
	}
}
