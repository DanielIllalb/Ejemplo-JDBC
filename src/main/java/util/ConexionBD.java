package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String url = "jdbc:postgresql://localhost:5432/jardineria";
    private static final String user = "jardinero";
    private static final String pass = "jardinero";

    private static Connection con;

    public static Connection getConnection() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection(url, user, pass);
        }
        return con;
    }

    public static void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}
