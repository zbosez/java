import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test_search {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/z1?" +
                "characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("zbosszsql");
        Connection connection = dataSource.getConnection();

        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id+"\t"+name);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
