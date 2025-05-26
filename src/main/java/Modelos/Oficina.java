package Modelos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Oficina {
    private String codigoOficina;
    private String ciudad;
    private String pais;
    private String region;
    private String codigoPostal;
    private String telefono;
    private String lineaDireccion1;
    private String lineaDireccion2;

    public String toString() {
        return "Oficina nº " + codigoOficina +
                "\nCiudad: " + ciudad +
                "\nPais: " + pais +
                "\nRegion: " + region +
                "\nCodigo Postal: " + codigoPostal +
                "\nTelefono: " + telefono +
                "\nLinea Direccion1: " + lineaDireccion1 +
                "\nLinea Direccion2: " + lineaDireccion2 + "\n";
    }
}
