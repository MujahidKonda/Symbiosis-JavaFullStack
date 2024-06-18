import java.sql.*;

class InsertIntoTablequery {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "mujahid@9175";
        String InsertIntoTablequery = "Insert into student (id,name,age) values (1,'mujahid',21);";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        st.executeUpdate(InsertIntoTablequery);
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}