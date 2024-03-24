package vista;

import javax.swing.*;
import java.awt.*;
import controlador.controladorWeb;


public class panWeb extends JPanel {
    private JButton anadirCuenta;
    private JButton eliminarCuenta;
    private JButton consultarCuentas;
    private JButton actualizarCuentas;
    private JButton regresarPantalla;
    private JPanel panelBotones;
    private JLabel nombreCuenta;
    private Font fuente;
    private controladorWeb c;


    public panWeb(){
        c = new controladorWeb(this);
       interfaz();
       controlador();
    }
    void interfaz(){
        fuente = new Font("Segoe UI", Font.BOLD, 40);
        setLayout(new BorderLayout());
        panelBotones = new JPanel(new GridLayout(6,1,0,10));
        regresarPantalla=disenoBoton("Regresar Pantalla");
        consultarCuentas = disenoBoton("Consultar Cuenta");
        anadirCuenta = disenoBoton("Anadir Cuenta");
        eliminarCuenta = disenoBoton("Eliminar Cuenta");
        actualizarCuentas = disenoBoton("Actualizar Cuenta");
        nombreCuenta = disenoLabel("Pagina WEB");
        nombreCuenta.setIcon(new ImageIcon("src/logo3.png"));

        panelBotones.setBackground(new Color(26, 34, 56));
        panelBotones.add(nombreCuenta);
        panelBotones.add(consultarCuentas);
        panelBotones.add(anadirCuenta);



        add(panelBotones);
    }
    void controlador(){
        consultarCuentas.addActionListener(c);
        anadirCuenta.addActionListener(c);
        eliminarCuenta.addActionListener(c);
        actualizarCuentas.addActionListener(c);

    }

    JButton  disenoBoton(String texto){
        JButton boton = new JButton(texto);
        boton.setFont(fuente);
        boton.setFont(fuente.deriveFont(Font.BOLD, 20));
        boton.setBackground(new Color(26, 34, 56));
        boton.setForeground(Color.white);
        boton.setBorderPainted(false);
        return boton;
    }
    JLabel disenoLabel(String texto){
        JLabel label = new JLabel(texto);
        label.setFont(fuente);
        label.setForeground(Color.white);
        return label;
    }

    public JButton getAnadirCuenta() {
        return anadirCuenta;
    }

    public void setAnadirCuenta(JButton anadirCuenta) {
        this.anadirCuenta = anadirCuenta;
    }

    public JButton getEliminarCuenta() {
        return eliminarCuenta;
    }

    public void setEliminarCuenta(JButton eliminarCuenta) {
        this.eliminarCuenta = eliminarCuenta;
    }

    public JButton getConsultarCuentas() {
        return consultarCuentas;
    }

    public void setConsultarCuentas(JButton consultarCuentas) {
        this.consultarCuentas = consultarCuentas;
    }

    public JButton getActualizarCuentas() {
        return actualizarCuentas;
    }

    public void setActualizarCuentas(JButton actualizarCuentas) {
        this.actualizarCuentas = actualizarCuentas;
    }

    public JButton getRegresarPantalla() {
        return regresarPantalla;
    }

    public void setRegresarPantalla(JButton regresarPantalla) {
        this.regresarPantalla = regresarPantalla;
    }
}
