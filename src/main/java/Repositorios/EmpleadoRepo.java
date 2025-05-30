package Repositorios;

import Modelos.Empleado;
import util.ConexionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepo {

    private static final String LISTAR_EMPLEADOS = "SELECT * FROM empleado";

    private Connection obtenerConexion() throws SQLException {
        return ConexionBD.getConnection();
    }

    private Statement obtenerSentencia() throws SQLException {
        return obtenerConexion().createStatement();
    }

    public Empleado leerEmpleado(int id) throws SQLException {
        Empleado empleado = new Empleado();
        return empleado;
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        try(Statement stm = obtenerSentencia();
            ResultSet rs = stm.executeQuery(LISTAR_EMPLEADOS)) {
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCodigoEmpleado(rs.getInt("codigo_empleado"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido1(rs.getString("apellido1"));
                empleado.setApellido2(rs.getString("apellido2"));
                empleado.setEmail(rs.getString("email"));
                empleado.setExtension(rs.getString("extension"));
                empleado.setCodigoOficina(rs.getString("codigo_oficina"));
                empleado.setCodigoJefe(rs.getString("codigo_jefe"));
                empleados.add(empleado);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }

        return empleados;
    }
}
