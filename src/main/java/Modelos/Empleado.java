package Modelos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {
    private int codigoEmpleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String extension;
    private String email;
    private String codigoOficina;
    private String codigoJefe;
    private String puesto;


    public String toString() {
        return "Empleado nº " + codigoEmpleado +
                "\nNombre: " + nombre +
                "\nApellido1: " + apellido1 +
                "\nApellidos2: " + apellido2 + "\n";
    }

}
