package modelo;

import java.io.Serializable;

public class website extends registro implements Serializable {
    private static final long serialVersionUID = 1L;
    public website(String nombreRegistro, String nombreUsuario, String constrasena, String correo, String url, String tipoCuenta) {
        super(nombreRegistro, nombreUsuario, constrasena, correo, url, tipoCuenta);
    }
    public website(){}

}
