import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test_del {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/" +
                "z1?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("usename");
        ((MysqlDataSource)dataSource).setPassword("password");
        Connection connection = dataSource.getConnection();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的id：");
        int id = scanner.nextInt();
        String sql = "delete from student where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        int ret = statement.executeUpdate();
        System.out.println(statement);
        System.out.println("ret= "+ret);
        statement.close();
        connection.close();
    }
}
