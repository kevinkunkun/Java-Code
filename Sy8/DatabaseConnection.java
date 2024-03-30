package Sy8;

import javax.xml.transform.Result;
import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/mysql";
        String username="root";
        String password="1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from account");
            while (resultSet.next()){
                String name=resultSet.getString("name");
                double money=resultSet.getDouble("money");
                System.out.println(name+","+money);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
