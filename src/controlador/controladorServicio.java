package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;
import vista.configuraciones.configServicio;
import vista.formularios.formularioServicio;
import modelo.archivos;

public class controladorServicio implements ActionListener {
    vista.panServicio frameServicio;
    formularioServicio fs;
    vista.mainFrame m;
    configServicio consultar;
    archivos a;



    public controladorServicio(panServicio frameServicio) {
        this.frameServicio = frameServicio;
    }
    public controladorServicio(){
        frameServicio=new panServicio();
        a=new archivos();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        fs=new formularioServicio(m,"FORMULARIO", true);
        consultar =new configServicio(m,"INFORMACION", true);




        if(e.getSource()==frameServicio.getAnadirCuenta()){
            fs.setVisible(true);

        }
        if(e.getSource()==frameServicio.getConsultarCuentas()){
            consultar.setVisible(true);




        }




    }
}