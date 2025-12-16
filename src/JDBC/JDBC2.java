package JDBC;

import java.sql.*;

public class JDBC2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String url = "jdbc:mysql://localhost:3306/automation";
        String user = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,user,password);

        // 3. creating a statement
        Statement st = con.createStatement();

        // 4. executing query (DML Query)
        String sql = "select * from student";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno") +"\t");
            System.out.print(rs.getString("name") +"\t");
            System.out.print(rs.getString("branch") +"\t");
            System.out.println(rs.getInt("marks"));
        }
    }
}
