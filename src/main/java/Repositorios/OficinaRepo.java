package Repositorios;

import Modelos.Oficina;
import util.ConexionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OficinaRepo {

    private static final String LISTAR_OFICINAS = "SELECT * FROM oficina";

    private Connection obtenerConexion() throws SQLException {
        return ConexionBD.getConnection();
    }

    private Statement obtenerSentencia() throws SQLException {
        return obtenerConexion().createStatement();
    }

    public Oficina obtenerOficina(String codigoOficina) throws SQLException {
        Oficina oficina = new Oficina();
        return oficina;
    }

    public List<Oficina> listarOficinas() throws SQLException {
        List<Oficina> oficinas = new ArrayList<>();

        try (Statement sentencia = obtenerSentencia();
        ResultSet resultado = sentencia.executeQuery(LISTAR_OFICINAS)) {
            while (resultado.next()) {
                Oficina oficina = new Oficina();
                oficina.setCodigoOficina(resultado.getString("codigo_oficina"));
                oficina.setCiudad(resultado.getString("ciudad"));
                oficina.setPais(resultado.getString("pais"));
                oficina.setRegion(resultado.getString("region"));
                oficina.setCodigoPostal(resultado.getString("codigo_postal"));
                oficina.setTelefono(resultado.getString("telefono"));
                oficina.setLineaDireccion1(resultado.getString("linea_direccion1"));
                oficina.setLineaDireccion2(resultado.getString("linea_direccion2"));
                oficinas.add(oficina);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return oficinas;
    }
}
