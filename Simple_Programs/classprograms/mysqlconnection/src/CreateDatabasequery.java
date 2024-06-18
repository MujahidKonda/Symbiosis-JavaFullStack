import java.sql.*;

public class CreateDatabasequery {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "mujahid@9175";
        String tableCreateQuery = "create database school;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        st.executeUpdate(tableCreateQuery);
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}