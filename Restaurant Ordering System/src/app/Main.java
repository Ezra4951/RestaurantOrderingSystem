package app;

import java.sql.Connection;

import database.DBConnection;

public class Main {

    public static void main(String[] args) {

        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("Database Connected!");
        }
    }
}
