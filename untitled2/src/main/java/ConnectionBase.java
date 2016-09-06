import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * Created by DarthVader on 11.08.2016.
 */
public class ConnectionBase {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:C:\\projects\\Db";
    static final String USER = "";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT user_name FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String user_name = rs.getString("user_name");
                //int age = rs.getInt("age");
              ///  String first = rs.getString("first");
              //  String last = rs.getString("last");

               System.out.println("user_name: " + user_name);
               // System.out.print(", Age: " + age);
               // System.out.print(", First: " + first);
               // System.out.println(", Last: " + last);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

