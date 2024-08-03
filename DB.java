import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    static Connection conn = null;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/niraj3";
            String userName = "root";
            String password = "Niraj@1234";
            conn = DriverManager.getConnection(url, userName, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
