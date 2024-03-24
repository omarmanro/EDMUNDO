package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.configuraciones.*;
import vista.*;
import vista.formularios.formularioApp;

public class controladorApp implements ActionListener {
    vista.panApp frameApp;

    vista.mainFrame m;
    formularioApp fa;
    configApp ca;

    public controladorApp(panApp frameApp) {
        this.frameApp = frameApp;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ca=new configApp(m, "INFORMACION",true);
        fa=new formularioApp(m,"FORMULARIO", true);
if ((e.getSource()==frameApp.getAnadirCuenta())){
     fa.setVisible(true);


}
if(e.getSource()==frameApp.getConsultarCuentas()){
    ca.setVisible(true);
}



    }
}
