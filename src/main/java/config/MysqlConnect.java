package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
    private static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/work_assignment";
    private static final String user = "test";
    private static final String password = "123456";

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            return null;
        }
    }
}
