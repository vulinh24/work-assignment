package repository;

import model.TestModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static config.MysqlConnect.getConnection;

public class Test {
    public static void test(TestModel testModel) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into test values(?,?)");
            preparedStatement.setInt(1,testModel.getId());
            preparedStatement.setInt(2,testModel.getTest());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
