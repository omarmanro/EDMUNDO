package vista.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.componentes.txtNumeroReal;
import modelo.banco;
import vista.mainFrame;

public class formularioBanco extends JDialog implements ActionListener {
    private JLabel labelNombre;
    private JLabel labelUsuario;
    private JLabel labelContrasena;
    private JLabel labelCorreo;
    private JLabel labelUrl;
    private JLabel labelNumTarjeta;
    private JLabel labelNip;
    private JLabel labelCve;
    private JLabel labelVencimiento;
    private JLabel labelTipoTarjeta;
    private txtNumeroReal txtNip;
    private txtNumeroReal txtNumeroTarjeta;
    private txtNumeroReal txtCve;


    private JTextField txtNombre;
    private  JTextField txtUsuario;
    private JTextField txtContrasena;
    private JTextField txtCorreo;
    private JTextField txtUrl;
    private JComboBox tipoTarjeta;
    private JPanel panelFormulario;
    private JButton botonGuardar;
    private mainFrame m;
    private banco b;

    public formularioBanco(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        setSize(400,600);
        interfaz();
        pack();

    }





    void interfaz(){
        b=new banco();
        panelFormulario=new JPanel(new GridLayout(0,2,0,5));


        labelNombre =new JLabel("Nombre de la App: ");
        labelContrasena=new JLabel("Contrasena: ");
        labelCorreo=new JLabel("Correo: ");
        labelUsuario=new JLabel("Usurario: ");
        labelNip =new JLabel("Nip: ");
        labelNumTarjeta=new JLabel("Numero Tarjeta: ");
        labelCve=new JLabel("CVE: ");
        labelTipoTarjeta=new JLabel("Tipo de Tarjeta: ");


        txtNombre=new JTextField();
        txtContrasena=new JTextField();
        txtCorreo=new JTextField();
        txtUsuario=new JTextField();
        txtNip =new txtNumeroReal(4);
        txtNumeroTarjeta=new txtNumeroReal(16);
        txtCve=new txtNumeroReal(3);

        botonGuardar=new JButton("Guardar");

        tipoTarjeta=new JComboBox(b.getTipoTarjeta());


        panelFormulario.add(labelNombre);
        panelFormulario.add(txtNombre);
        panelFormulario.add(labelUsuario);
        panelFormulario.add(txtUsuario);
        panelFormulario.add(labelCorreo);
        panelFormulario.add(txtCorreo);
        panelFormulario.add(labelContrasena);
        panelFormulario.add(txtContrasena);
        panelFormulario.add(labelNumTarjeta);
        panelFormulario.add(txtNumeroTarjeta);
        panelFormulario.add(labelTipoTarjeta);
        panelFormulario.add(tipoTarjeta);
        panelFormulario.add(labelCve);
        panelFormulario.add(txtCve);
        panelFormulario.add(labelNip);
        panelFormulario.add(txtNip);
        panelFormulario.add(botonGuardar);

        add(panelFormulario);

    }

    void escuchas(){
        txtContrasena.addActionListener(this);
        botonGuardar.addActionListener(this);
        txtCorreo.addActionListener(this);
        txtNombre.addActionListener(this);
        txtUsuario.addActionListener(this);
        txtNumeroTarjeta.addActionListener(this);
        txtNip.addActionListener(this);
        txtCve.addActionListener(this);
        tipoTarjeta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonGuardar){

        }

    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public void setLabelNombre(JLabel labelNombre) {
        this.labelNombre = labelNombre;
    }

    public txtNumeroReal getTxtNip() {
        return txtNip;
    }

    public void setTxtNip(txtNumeroReal txtNip) {
        this.txtNip = txtNip;
    }

    public txtNumeroReal getTxtNumeroTarjeta() {
        return txtNumeroTarjeta;
    }

    public void setTxtNumeroTarjeta(txtNumeroReal txtNumeroTarjeta) {
        this.txtNumeroTarjeta = txtNumeroTarjeta;
    }

    public txtNumeroReal getTxtCve() {
        return txtCve;
    }

    public void setTxtCve(txtNumeroReal txtCve) {
        this.txtCve = txtCve;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JTextField getTxtContrasena() {
        return txtContrasena;
    }

    public void setTxtContrasena(JTextField txtContrasena) {
        this.txtContrasena = txtContrasena;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JComboBox getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(JComboBox tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public void setBotonGuardar(JButton botonGuardar) {
        this.botonGuardar = botonGuardar;
    }
}
