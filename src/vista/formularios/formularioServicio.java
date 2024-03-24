package vista.formularios;

import vista.configuraciones.configServicio;
import vista.mainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.archivos;
import controlador.controladorServicio;
import vista.panServicio;

public class formularioServicio extends JDialog implements ActionListener {
    private JLabel labelNombre;
    private JLabel labelUsuario;
    private JLabel labelContrasena;
    private JLabel labelCorreo;
    private JLabel labelUrl;
private JLabel labelUsuarioAfiliado;
private JLabel labelDomicilio;
private JLabel labelDatoExtra;


    private JTextField txtNombre;
    private  JTextField txtUsuario;
    private JPasswordField pwContrasena;
    private JTextField txtCorreo;
    private JTextField txtUrl;
    private JTextField txtUsuarioAfiliado;
    private JTextField txtDomicilio;
    private JTextField txtDatoExtra;
    private JPanel panelFormulario;
    private JButton botonGuardar;
    private mainFrame m;
    private controladorServicio cs;

    private DefaultTableModel modelo;
    private Object[][] data ={
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
    };
    private JTable tableConfig;
    private String[] datos = new String[6];
    private archivos a;
    private configServicio csTabla;
    private String[] columnNames = {"Nombre del Servicio","Usuario Afiliado", "Correo", "Contrasena", "Domicilio", "Dato Extra"};

    public formularioServicio(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        a=new archivos();
        setSize(400,600);
        interfaz();
        pack();

    }





    void interfaz(){
        cs=new controladorServicio(new panServicio());
csTabla=new configServicio();
        panelFormulario=new JPanel(new GridLayout(0,2,0,5));


        labelNombre =new JLabel("Nombre del servicio: ");
        labelContrasena=new JLabel("Contrasena: ");
        labelCorreo=new JLabel("Correo: ");
        labelUsuario=new JLabel("Usurario: ");
        labelUrl=new JLabel("URL: ");
        labelDomicilio=new JLabel("Domicilio: ");
        labelUsuarioAfiliado=new JLabel("Usuario Afiliado: ");
        labelDatoExtra =new JLabel("Dato Extra: ");

        txtNombre=new JTextField();
        pwContrasena=new JPasswordField();
        txtCorreo=new JTextField();
        txtUsuario=new JTextField();
        txtUrl=new JTextField();
        txtDatoExtra=new JTextField();
        txtDomicilio=new JTextField();
        txtUsuarioAfiliado=new JTextField();

        botonGuardar=new JButton("Guardar");

        panelFormulario.add(labelNombre);
        panelFormulario.add(txtNombre);

        panelFormulario.add(labelUsuarioAfiliado);
        panelFormulario.add(txtUsuarioAfiliado);

        panelFormulario.add(labelCorreo);
        panelFormulario.add(txtCorreo);

        panelFormulario.add(labelContrasena);
        panelFormulario.add(pwContrasena);

        panelFormulario.add(labelDomicilio);
        panelFormulario.add(txtDomicilio);

        panelFormulario.add(labelDatoExtra);
        panelFormulario.add(txtDatoExtra);

        botonGuardar.addActionListener(this);
        panelFormulario.add(botonGuardar);

        add(panelFormulario);

    }
    void escuchas(){
       pwContrasena.addActionListener(this);
        botonGuardar.addActionListener(this);
        txtCorreo.addActionListener(this);
        txtNombre.addActionListener(this);
        txtUsuario.addActionListener(this);
        txtUrl.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
    a=new archivos() ;
    if(e.getSource()==getBotonGuardar()){
            String contra=String.valueOf(pwContrasena.getPassword());
            String[] informacion = {
                    txtNombre.getText(),
                    txtUsuarioAfiliado.getText(),
                    txtCorreo.getText(),
                    contra,
                    txtDomicilio.getText(),
                    txtDatoExtra.getText()
            };

            for(int i=0;i< informacion.length;i++){
                datos[i]=informacion[i];
            }
            a.guardarConfiguracionFragmentos(datos);
csTabla.llenarTabla(a.cargarConfiguracionFragmentos());
            dispose();
        }

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

    public JTextField getTxtUsuarioAfiliado() {
        return txtUsuarioAfiliado;
    }

    public void setTxtUsuarioAfiliado(JTextField txtUsuarioAfiliado) {
        this.txtUsuarioAfiliado = txtUsuarioAfiliado;
    }

    public JTextField getTxtDomicilio() {
        return txtDomicilio;
    }

    public void setTxtDomicilio(JTextField txtDomicilio) {
        this.txtDomicilio = txtDomicilio;
    }

    public JTextField getTxtDatoExtra() {
        return txtDatoExtra;
    }

    public void setTxtDatoExtra(JTextField txtDatoExtra) {
        this.txtDatoExtra = txtDatoExtra;
    }
    public String[] getDatos() {
        return datos;
    }
    public JPasswordField getPwContrasena() {
        return pwContrasena;
    }

    public void setPwContrasena(JPasswordField pwContrasena) {
        this.pwContrasena = pwContrasena;
    }

    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public void setBotonGuardar(JButton botonGuardar) {
        this.botonGuardar = botonGuardar;
    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public void setLabelNombre(JLabel labelNombre) {
        this.labelNombre = labelNombre;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
    public void setDatos(String[] datos) {
        this.datos = datos;
    }
}