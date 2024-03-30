package Sy12;

import java.sql.*;

public class Demo {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("加载驱动失败");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        queryAll();
        insertStudent(new Student(102,"张三",90));
        insertStudent(new Student(103,"李四",23));
        updateStudent(3);
        deleteStudent(8);
    }

    public static void queryAll() {
        String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from student");
            System.out.println("您所查询的数据如下：");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double score = resultSet.getDouble("score");
                int id = resultSet.getInt("id");
                Student student = new Student(id, name, score);
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

     static void insertStudent(Student student) {
        Connection con;
        String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "root";

        try {
            con = DriverManager.getConnection(url, user, password);

            String sql = "insert into student values(null,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, student.getName());
            preparedStatement.setDouble(2, student.getScore());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("已成功插入此学生！");
    }

    static void updateStudent(int id) {
        String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "root";
        Connection con = null;
        PreparedStatement preparedStatement = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            String sql = "update student set score=? where id = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setDouble(1, 100);
            preparedStatement.setInt(2, id);
            System.out.println("修改成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    static void deleteStudent(int id) {
        String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "root";
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            String sql = "delete from student where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            System.out.println("删除成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
