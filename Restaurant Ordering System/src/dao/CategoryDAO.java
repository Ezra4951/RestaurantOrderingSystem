package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import database.DBConnection;
import model.Category;

public class CategoryDAO {
	
	public void addCategory(Category category) {
		
		String sql = "INSERT INTO categories(category_name) VALUES (?)";
		
		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				) {
			
			ps.setString(1, category.getCategoryName());
			
			int rows = ps.executeUpdate();
			
			if (rows > 0) {
				System.out.println("Category added Succesfully!!!");
			}
			
			
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	public void viewCategories() {

	    String sql = "SELECT * FROM categories";

	    try (
	        Connection conn = DBConnection.getConnection();
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	    ) {

	        System.out.println("===== Categories =====");

	        while (rs.next()) {

	            int id = rs.getInt("category_id");
	            String name = rs.getString("category_name");
	            System.out.println(id + " - " + name);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void updateCategory(Category category) {
		
		String sql = "UPDATE categories\r\n"
				+ "SET category_name = ?\r\n"
				+ "WHERE category_id = ?;";
		try (
		        Connection conn = DBConnection.getConnection();
		        PreparedStatement ps = conn.prepareStatement(sql);
		    ) {
				ps.setString(1, category.getCategoryName());
				ps.setInt(2, category.getCategoryId());
				
				int rows = ps.executeUpdate();
				
				if (rows > 0) {
				    System.out.println("Category updated successfully!");
				} else {
				    System.out.println("Category ID not found.");
				}
		} catch (Exception e) {
	        e.printStackTrace();
	   }
	}
	
	public void deleteCategory(int id) {
		
		String sql = "DELETE FROM categories\r\n"
				+ "WHERE category_id = ?;";
		try (
			    Connection conn = DBConnection.getConnection();
			    PreparedStatement ps = conn.prepareStatement(sql);
			) {
				
				ps.setInt(1, id);
				
				int rows = ps.executeUpdate();
				
				if (rows > 0) {
				    System.out.println("Category deleted successfully!");
				} else {
				    System.out.println("Category ID not found.");
				}
			
			}
			catch (Exception e) {
			    e.printStackTrace();
			}
		}
}
