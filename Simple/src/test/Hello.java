package test;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double weight;
		double newWeight;
		int choice;
		
		System.out.println("---Welcome to my weight converter!!!!---\n");
		System.out.println("1. Convert lbs to kgs");
		System.out.println("2. Convert kgs to lbs\n");
		
		System.out.print("Choice an option: ");
		choice = input.nextInt();
		
		if(choice == 1) {
			System.out.print("\nEnter your weight in lbs: ");
			weight = input.nextDouble();
			newWeight = weight * 0.453592;
			System.out.printf("The new weight in kgs is %.2f", newWeight);
		} else if(choice == 2) {
			System.out.print("\nEnter your weight in kgs: ");
			weight = input.nextDouble();
			newWeight = weight * 2.20462;
			System.out.printf("The new weight in lbs is %.2f", newWeight);
		} else {
			System.out.println("INVALID CHOICE!!!!!!");
		}
		
	 input.close();
	}
}
