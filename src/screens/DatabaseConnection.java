package screens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados"; // Substitua pelo seu banco
    private static final String USER = "root"; // Substitua pelo seu usuário
    private static final String PASSWORD = "sua_senha"; // Substitua pela sua senha

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
