package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
import vista.formularios.formularioWeb;
import vista.configuraciones.*;

public class controladorWeb implements ActionListener {
    vista.panWeb frameWeb;
    formularioWeb fw;
    vista.mainFrame m;
    configWeb cw;

    public controladorWeb(panWeb frameWeb) {
        this.frameWeb = frameWeb;

    }


    @Override

    public void actionPerformed(ActionEvent e) {
        fw = new formularioWeb(m, "FORMULARIO", true);
        cw =  new configWeb(m,"INFORMACION", true);
        if ((e.getSource() == frameWeb.getAnadirCuenta())) {
            fw.setVisible(true);


        }
        if (e.getSource()==frameWeb.getConsultarCuentas()){
            cw.setVisible(true);
        }

    }
}