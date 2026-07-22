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
}
