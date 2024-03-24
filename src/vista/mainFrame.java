package vista;
import controlador.controladorMenu;
import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {
    private JLabel labelNombre;
    private Font fuente;
    private JPanel panelPrincipal;
    private JMenu menu;
    private JMenuBar menuBar;
    private JMenuItem inicio;
    private JPanel panelBotones;
    private JButton botonApp;
    private JButton botonWeb;
    private JButton botonBanco;
    private JButton botonServicio;
    private controladorMenu c;


    public mainFrame() {
        c = new controladorMenu(this);
        fuente = new Font("Segoe UI", Font.BOLD, 40);
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        interfaz();
        controlador();
        setVisible(true);
    }

    void interfaz() {
        menu= new JMenu("OPCIONES");

        menuBar = new JMenuBar();
        inicio = new JMenuItem("INICIO");
        menu.add(inicio);
        menuBar.add(menu);
        panelPrincipal = new JPanel(new BorderLayout());
        panelBotones = new JPanel(new GridLayout(6,1,0,10));
        labelNombre = disenoLabel("PassWorld");
        botonWeb = disenoBoton("Pagina WEB");
        botonServicio = disenoBoton("Servicio");
        botonBanco =disenoBoton("Cuenta Bancaria");
        botonApp =disenoBoton("Aplicacion Movil");

        labelNombre.setFont(fuente);
        labelNombre.setIcon(new ImageIcon("src/logo3.png"));

        panelBotones.setBackground(new Color(26, 34, 56));
        panelBotones.add(labelNombre);
        panelBotones.add(botonBanco);
        panelBotones.add(botonWeb);
        panelBotones.add(botonApp);
        panelBotones.add(botonServicio);


        panelPrincipal.add(panelBotones);

        add(menuBar, BorderLayout.NORTH);
        add(panelPrincipal, BorderLayout.CENTER);


    }
   public void controlador(){
        System.out.println("entra");
        botonApp.addActionListener(c);
        botonBanco.addActionListener(c);
        botonServicio.addActionListener(c);
        botonWeb.addActionListener(c);
        inicio.addActionListener(c);
    }

    public void anadirPanel(JPanel panel){
        getContentPane().removeAll();
        System.out.println(getContentPane());
        add(menuBar, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
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


    public JButton getBotonApp() {
        return botonApp;
    }

    public void setBotonApp(JButton botonApp) {
        this.botonApp = botonApp;
    }

    public JButton getBotonWeb() {
        return botonWeb;
    }

    public void setBotonWeb(JButton botonWeb) {
        this.botonWeb = botonWeb;
    }

    public JButton getBotonBanco() {
        return botonBanco;
    }

    public void setBotonBanco(JButton botonBanco) {
        this.botonBanco = botonBanco;
    }

    public JButton getBotonServicio() {
        return botonServicio;
    }

    public void setBotonServicio(JButton botonServicio) {
        this.botonServicio = botonServicio;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JMenuItem getInicio() {
        return inicio;
    }

    public void setInicio(JMenuItem inicio) {
        this.inicio = inicio;
    }
}