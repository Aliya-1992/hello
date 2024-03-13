package org.example.tasks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jbc {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    static final String USER = "postgres";
    static final String PASS = "Samsung2023!";
    public static void main(String[] args) {
        System.out.println("Testing connection to PostgreSQL JDBC");

        //String sqlCommand = "CREATE TABLE if not exists newproducts (Id serial PRIMARY KEY , ProductName VARCHAR(20), Price INT)";
        String sqlCommand = "INSERT INTO newproducts(Productname, Price) Values ('product1', 100)";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
           Statement statement = connection.createStatement();
           statement.executeUpdate(sqlCommand);
           System.out.println("Database has been created!");
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
    }

}


