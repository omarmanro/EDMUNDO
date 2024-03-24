package vista.configuraciones;



import controlador.controladorServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;
import modelo.archivos;

public class configBanco extends JDialog implements ActionListener {
    private controladorServicio cs;
    private JPanel jp, jpTabla;
    private JTable tableConfig;
    private DefaultTableModel modelo;
    private JButton guardarConfiguracionBtn, btnBorrar;
    private String[] columnNames = {"Nombre Del Servicio", "Usuario Afiliado", "Correo", "Contrasena", "Domicilio", "Dato Extra"};
    private Object[][] data ={
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
    };
    private controladorServicio c;
    private boolean creada;
    private Font fuente;
    private archivos a;

    public configBanco(Frame owner, String title, boolean modal){
        super(owner, title, modal);
        a=new archivos();
        interfaz();

        pack();
        creada= false;
    }
    public configBanco(){}
    void interfaz(){

        cs=new controladorServicio();
        jpTabla = new JPanel(new BorderLayout());
        jp= new JPanel(new GridLayout(0,1,0,2));
        modelo = new DefaultTableModel(a.cargarConfiguracionFragmentos(), columnNames);
        guardarConfiguracionBtn = disenoBoton("Guardar");
        btnBorrar = disenoBoton("Borrar");
        tableConfig = new JTable(modelo);
        disenoTabla();

        setBackground(new Color(26, 34, 56));
        setResizable(false);
        JScrollPane tablapane = new JScrollPane(tableConfig);

        jpTabla.add(tablapane, BorderLayout.NORTH);
        jp.add(guardarConfiguracionBtn);
        jp.add(btnBorrar);
        jpTabla.add(jp, BorderLayout.SOUTH);

        add(jpTabla);
        escuchas();
    }
    void escuchas(){
        guardarConfiguracionBtn.addActionListener(this);
        btnBorrar.addActionListener(this);
    }
    private JButton disenoBoton(String texto) {
        JButton button = new JButton(texto);
        //  button.setFont(fuente);
        button.setBackground(new Color(26, 34, 56));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }
    private void disenoTabla() {
        //    tableConfig.setFont(fuente);
        //     tableConfig.setRowHeight((int) (fuente.getSize() * 1.5));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tableConfig.getColumnCount(); i++) {
            tableConfig.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JTableHeader encabezado = tableConfig.getTableHeader();
        //      encabezado.setFont(fuente.deriveFont(Font.BOLD));
        encabezado.setBackground(new Color(26, 34, 56));
        encabezado.setForeground(Color.WHITE);
        encabezado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }





    public void llenarTabla(Object[][]datos){
        tableConfig=new JTable();
        if(datos.length!= 0){
            data= datos;
        }
        modelo= new DefaultTableModel(datos, columnNames);
        tableConfig.setModel(modelo);
        revalidate();
        repaint();
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }
    public String[] obtenerConfiguracion(){
        String[] datos = new String[tableConfig.getRowCount()];
        if (tableConfig.getCellEditor() != null) {
            tableConfig.getCellEditor().stopCellEditing();
        }
        int blancos;
        StringBuilder renglon;
        for(int i = 0; i < tableConfig.getRowCount(); i++) {
            renglon = new StringBuilder();
            blancos=0;
            for (int j = 0; j < tableConfig.getColumnCount(); j++) {
                String linea= tableConfig.getModel().getValueAt(i, j).toString();
                if(linea.isEmpty()){
                    blancos++;
                }
                renglon.append(linea).append("-");
            }

            if(blancos== tableConfig.getColumnCount()) {
                continue;
            }
            datos[i] = renglon.substring(0,renglon.length()-1)+"\n";
        }
        return datos;
    }

    public boolean isCreada() {
        return creada;
    }

    public void setCreada(boolean creada){
        this.creada= creada;
    }
    public JButton getGuardarConfiguracionBtn() {
        return guardarConfiguracionBtn;
    }

    public JTable getTableConfig() {
        return tableConfig;
    }

    public void setTableConfig(JTable tableConfig) {
        this.tableConfig = tableConfig;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource()==btnBorrar){
            int ad= tableConfig.getSelectedRow();
            modelo.removeRow(ad);

            System.out.println("entra");
        }
    }
}

