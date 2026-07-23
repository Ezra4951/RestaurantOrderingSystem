package app;

import java.util.Scanner;
import dao.CategoryDAO;
// import database.DBConnection;
import model.Category;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void clearScreen() {
		System.out.println("\033[H\033[2J");
	    System.out.flush();
	}
	
	public static void pause() {
	    System.out.println();
	    System.out.print("Press ENTER to continue...");
	    input.nextLine();
	    clearScreen();
	}
		    
    public static void main(String[] args) {
    	
    	CategoryDAO dao = new CategoryDAO();
    	
    	int choice;
    do 	{
    	System.out.println("\n=== Category Menu ===");
    	System.out.println("1. Add Category!");
    	System.out.println("2. View Categories!");
    	System.out.println("3. Update Category!");
    	System.out.println("4. Delete Category");
    	System.out.println("5. EXIT!!!!");
    	System.out.println("=====================");
    	System.out.print("Choose: ");
    	choice = input.nextInt();
    	input.nextLine();
    	
    	System.out.println("\033[H\033[2J");
	    System.out.flush();
    	
    switch (choice) {
    	case 1: 
    		System.out.print("Enter Category Name: ");
    		String name = input.nextLine();
	
	
    		Category category = new Category(name);
    		dao.addCategory(category);
    		pause();
    		break;
    	case 2:
    		dao.viewCategories();
    		pause();
    		break;
    	case 3:
    		System.out.print("Enter CategoryId: ");
    		int id = input.nextInt();
    		input.nextLine();
    		System.out.print("Enter New Category Name: ");
    		String name1 = input.nextLine();
    		
    		Category category1 = new Category(id, name1);
    		dao.updateCategory(category1);
    		pause();
    		break;
    	case 4:
    		System.out.print("Enter CategoryID to delete: ");
    		int id1 = input.nextInt();
    		input.nextLine();
    		
    		dao.deleteCategory(id1);
    		pause();
    		break;
    	case 5:
    		System.out.println("Thank you for using my Restaurant Ordering Sys!");
    		break;
    	default:
    		 System.out.println("Invalid choice.");
    		  }
           } while (choice != 5);
    	input.close();
    }
 }



