package app;

import java.util.Scanner;
import dao.CategoryDAO;
// import database.DBConnection;
import model.Category;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	CategoryDAO dao = new CategoryDAO();
    	
    	System.out.println("=== Category Menu ===");
    	System.out.println("1. Add Category!");
    	System.out.println("2. View Categories!");
    	System.out.println("3. Update Category!");
    	System.out.println("4. Delete Category");
    	System.out.println("5. EXIT!!!!");
    	System.out.println("=====================");
    	System.out.print("Choose: ");
    	int choice = input.nextInt();
    	input.nextLine();
    	
    switch (choice) {
    	case 1: 
    		System.out.print("Enter Category Name: ");
    		String name = input.nextLine();
	
	
    		Category category = new Category(name);
    		dao.addCategory(category);
    		break;
    	case 2:
    		dao.viewCategories();
    		break;
    	case 3:
    		System.out.println("SO GLAD IT FIXED NOW LOL");
    		break;
    	case 4:
    		System.out.println("!!!!!!!!!");
    		break;
    	case 5:
    		System.out.println("Thank you for using my Restaurant Ordering Sys!");
    		break;
    	default:
    		 System.out.println("Invalid choice.");
    		}
    	
    		input.close();
        }
    }

