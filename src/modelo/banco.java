package modelo;

import java.io.Serializable;

public class banco extends registro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String numeroCuenta;
    private int numeroTarjeta;
    private String [] tipoTarjeta= {"debito","credito", "recompensa", "departamental"};
    private int nip;
    private int cve;
    private String vencimiento;

    public banco(String nombreRegistro, String nombreUsuario, String constrasena, String correo, String url, String tipoCuenta, String numeroCuenta, int numeroTarjeta, String[] tipoTarjeta, int nip, int cve, String vencimiento) {
        super(nombreRegistro, nombreUsuario, constrasena, correo, url, tipoCuenta);
        this.numeroCuenta = numeroCuenta;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.nip = nip;
        this.cve = cve;
        this.vencimiento = vencimiento;
    }
    public banco(){

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String[] getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String[] tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getCve() {
        return cve;
    }

    public void setCve(int cve) {
        this.cve = cve;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
}
