package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

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
        String sql = "insert into student values(15,'shridhar','IT',88)";

        st.executeUpdate(sql);
    }
}
