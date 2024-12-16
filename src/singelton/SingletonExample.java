package singelton;

import javax.sound.sampled.AudioSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SingletonExample {

    // 1. Private static instance (lazy initialization)
    private static SingletonExample instance;


    // 2. Private constructor to prevent instantiation from outside
    private SingletonExample() {
        // Initialization code, if needed
    }

    // 3. Public static method to provide the instance (lazy initialization)
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }


    public void someOperation() {
        System.out.println("Performing database operation in Singleton instance with code: " );

        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/con";
        String user = "postgres";
        String password = "1234";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load PostgreSQL JDBC driver (optional for newer Java versions)
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);

            // Create a statement and execute a query
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM users");

            // Process the result set
            while (resultSet.next()) {
                System.out.println("Row: " + resultSet.getString(1)); // Adjust column index or name as per your table
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        SingletonExample singletonOne = SingletonExample.getInstance();
        SingletonExample singletonTwo = SingletonExample.getInstance();

        System.out.println("Are the instances the same? " + (singletonOne == singletonTwo));
     singletonOne.someOperation();
        singletonOne.someOperation();
    }
}