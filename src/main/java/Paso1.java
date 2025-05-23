import java.sql.*;

public class Paso1 {
    public static void main(String[] args) throws SQLException {

        // Definición de los parámetros de conexión a la BBDD

        String url = "jdbc:postgresql://localhost:5432/jardineria";
        String user = "postgres";
        String pass = "root";

        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");

            while(rs.next()){
                System.out.println(
                        rs.getInt(1) + " "
                        + rs.getString(2) + " "
                        + rs.getString(3)
                );
            }

            rs.close();
            stmt.close();
            con.close();

        }catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }



    }
}
