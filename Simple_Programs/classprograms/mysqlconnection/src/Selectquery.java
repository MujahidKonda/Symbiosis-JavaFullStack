import java.sql.*;

class Selectquery {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "mujahid@9175";
        String selectquery = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(selectquery);
        for(int i = 0 ; i <= 4 ; i++){
            rs.next();
            String id = rs.getString("id");
            System.out.print(id + " ");
            String name = rs.getString("name");
            System.out.print(name + " ");
            String age = rs.getString("age");
            System.out.println(age);
        }
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}