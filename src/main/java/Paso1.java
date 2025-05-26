import Modelos.Empleado;
import Modelos.Oficina;
import Repositorios.EmpleadoRepo;
import Repositorios.OficinaRepo;

import java.sql.*;
import java.util.List;

public class Paso1 {

    public static void main(String[] args) throws SQLException {

        EmpleadoRepo repo = new EmpleadoRepo();
        List<Empleado> listEmpleados = repo.listarEmpleados();

        System.out.println("--------------- Lista de empleados -----------------");
        for (Empleado emp : listEmpleados) {
            System.out.println(emp);
        }


        OficinaRepo oficinaRepo = new OficinaRepo();
        List<Oficina> listOficinas = oficinaRepo.listarOficinas();

        System.out.println("--------------- Lista de oficinas ---------------");
        for (Oficina oficina : listOficinas) {
            System.out.println(oficina);
        }
    }
}
