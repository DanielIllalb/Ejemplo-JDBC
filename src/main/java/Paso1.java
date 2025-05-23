import java.sql.*;

public class Paso1 {

    public static void main(String[] args) throws SQLException {

        // Definición de los parámetros de conexión a la BBDD

        String url = "jdbc:postgresql://localhost:5432/jardineria";
        String user = "jardinero";
        String pass = "jardinero";

        // Se crean los recursos necesarios para la consulta fuera del try-catch

        try(
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(
                        "SELECT cl.nombre_cliente,em.nombre " +
                        "FROM cliente cl " +
                        "JOIN empleado em " +
                        "ON cl.codigo_empleado_rep_ventas = em.codigo_empleado"
                );
        )
        {
            while(rs.next()){
                System.out.println(
                        rs.getString("nombre_cliente") + " "
                        + rs.getString("nombre")
                );
            }

        }catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }



    }
}
