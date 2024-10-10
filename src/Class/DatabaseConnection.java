package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jbdc:myslq://200.195.171.124";
    private static final String USER = "grupo05"; 
    private static final String PASSWORD = "Uib4AV0cgH3DjAwB";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
