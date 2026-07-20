package test;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.println("===WELCOME TO MY BASIC CALCULATOR===");
			System.out.println("Type cancel if you want to exit!!!");
			System.out.print("Enter Operator [+, -, *, /, %]: ");
			String op = input.nextLine();
			
			System.out.print("Enter your First Number: ");
			double num = input.nextFloat();
			
			
			System.out.print("Enter your Second Number: ");
			double num2 = input.nextFloat();
			input.nextLine();
			
			 if (op.equalsIgnoreCase("cancel")) {
				 System.out.println("Calculator Cancelled.... EXITING CALCULATOR! TRY AGAIN!!");
				 return;
			 } if (op.matches("[0-9]+")) {
				 System.out.println("ERROR!!!! Restarting.....!!!!\n");
				 continue;
			  }
			 
			 	double result = 0;
		
	    	char operator = op.charAt(0);
		
	    	boolean valid = true;
		
		
	    	switch(operator) {
		case '+':
			result = num + num2; break;
		case '-':
			result = num - num2; break;
		case '*':
			result = num * num2; break;
		case '/':
			if (num2 != 0) {
				result = num / num2;
			} else {
				System.out.println("SYSTEM ERROR!!! Division by zero!!!!!");
				valid = false;
			   } break;
		case '%':
			result = num % num2; break;
			   default: 
				   System.out.println("Invalid operator. Please use +, -, *, or /.");
	    	} 
			  if (valid) {
				  String format = String.format("Result: %.2f\n", result);
				System.out.println(format);
			}
	    }
		input.close();
  }
}
