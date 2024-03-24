package modelo;

import java.io.Serializable;

public class app extends registro implements Serializable {
    private static final long serialVersionUID = 1L;
    public app(String nombreRegistro, String nombreUsuario, String constrasena, String correo, String url, String tipoCuenta) {
        super(nombreRegistro, nombreUsuario, constrasena, correo, url, tipoCuenta);
    }
    public app(){}
}
