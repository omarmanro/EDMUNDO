package modelo;

import java.io.Serializable;

public class servicio extends registro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cuenta;
    private String usuarioAfiliado;
    private String domicilio;
    private String datoExtra;

    public servicio(String cuenta, String usuarioAfiliado, String domicilio, String datoExtra) {
        super();
        this.cuenta = cuenta;
        this.usuarioAfiliado = usuarioAfiliado;
        this.domicilio = domicilio;
        this.datoExtra = datoExtra;
    }
    public servicio(){

    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsuarioAfiliado() {
        return usuarioAfiliado;
    }

    public void setUsuarioAfiliado(String usuarioAfiliado) {
        this.usuarioAfiliado = usuarioAfiliado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDatoExtra() {
        return datoExtra;
    }

    public void setDatoExtra(String datoExtra) {
        this.datoExtra = datoExtra;
    }
}
