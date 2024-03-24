package modelo;

public class registro {
    private String nombreRegistro;
    private String nombreUsuario;
    private String contrasena;
    private String correo;
    private String url;
    private String tipoCuenta;

    public registro (String nombreRegistro, String nombreUsuario, String contrasena, String correo, String url, String tipoCuenta){
       super();
        this.nombreRegistro=nombreRegistro;
        this.nombreUsuario=nombreUsuario;
        this.contrasena = contrasena;
        this.url=url;
        this.correo=correo;
        this.tipoCuenta=tipoCuenta;
    }
    public registro(){
        super();
    }

    public String getNombreRegistro() {
        return nombreRegistro;
    }

    public void setNombreRegistro(String nombreRegistro) {
        this.nombreRegistro = nombreRegistro;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
