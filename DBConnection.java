import java.sql.*;

public class DBConnection {
    static Connection con;

    @SuppressWarnings("UseSpecificCatch")
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            if (con == null) {
                String url = "jdbc:mysql://localhost:3306/studentdb";
                String user = "root";
                String pass = "Uttukul2004@";
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Database Connected Successfully.");
            }
        } catch (Exception e) {
            System.out.println("DB Connection Error: " + e.getMessage());
        }
        return con;
    }
}

