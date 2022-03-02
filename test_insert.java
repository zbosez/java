import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test_insert {
    public static void main(String[] args) throws SQLException {


        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/z1?" +
                "characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("zbosszsql");
        Connection connection = dataSource.getConnection();


        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入id：");
        int id = scanner.nextInt();
        System.out.print("请输入姓名：");
        String name = scanner.next();
        /*String sql = "insert into student values("+id+",'"+name+"')";*/
        String sql ="insert into student values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,name);
        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = "+ ret);
        statement.close();
        connection.close();


    }
}
