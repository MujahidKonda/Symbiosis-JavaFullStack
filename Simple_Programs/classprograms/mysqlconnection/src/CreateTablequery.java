import java.sql.*;

class CreateTablequery {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "mujahid@9175";
        String tableCreateQuery = "create table student ( id int(10), name varchar(100), age int(10) );";
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