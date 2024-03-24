package vista.formularios;

import vista.mainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formularioWeb extends JDialog implements ActionListener {
    private JLabel labelNombre;
    private JLabel labelUsuario;
    private JLabel labelContrasena;
    private JLabel labelCorreo;
    private JLabel labelUrl;


    private JTextField txtNombre;
    private  JTextField txtUsuario;
    private JTextField txtContrasena;
    private JTextField txtCorreo;
    private JTextField txtUrl;
    private JPanel panelFormulario;
    private JButton botonGuardar;
    private mainFrame m;

    public formularioWeb(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        setSize(400,600);
        interfaz();
        escuchas();
        pack();

    }





    void interfaz(){
        panelFormulario=new JPanel(new GridLayout(6,2,0,5));


        labelNombre =new JLabel("Nombre de la App: ");
        labelContrasena=new JLabel("Contrasena: ");
        labelCorreo=new JLabel("Correo: ");
        labelUsuario=new JLabel("Usurario: ");
        labelUrl=new JLabel("URL: ");

        txtNombre=new JTextField();
        txtContrasena=new JTextField();
        txtCorreo=new JTextField();
        txtUsuario=new JTextField();
        txtUrl=new JTextField();

        botonGuardar=new JButton("Guardar");
        botonGuardar.addActionListener(this);

        panelFormulario.add(labelNombre);
        panelFormulario.add(txtNombre);
        panelFormulario.add(labelUrl);
        panelFormulario.add(txtUrl);
        panelFormulario.add(labelUsuario);
        panelFormulario.add(txtUsuario);
        panelFormulario.add(labelCorreo);
        panelFormulario.add(txtCorreo);
        panelFormulario.add(labelContrasena);
        panelFormulario.add(txtContrasena);
        panelFormulario.add(botonGuardar);

        add(panelFormulario);

    }
    void escuchas(){
        txtContrasena.addActionListener(this);
        botonGuardar.addActionListener(this);
        txtCorreo.addActionListener(this);
        txtNombre.addActionListener(this);
        txtUsuario.addActionListener(this);
        txtUrl.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public void setLabelNombre(JLabel labelNombre) {
        this.labelNombre = labelNombre;
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

    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public void setBotonGuardar(JButton botonGuardar) {
        this.botonGuardar = botonGuardar;
    }
}