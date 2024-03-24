package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
import vista.formularios.formularioBanco;
import vista.configuraciones.*;

public class controladorBanco implements ActionListener {
    vista.panBanco frameBanco;
    formularioBanco fb;
    vista.mainFrame m;
    configBanco cb;


    public controladorBanco(panBanco frameBanco) {
        this.frameBanco = frameBanco;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        fb = new formularioBanco(m, "FORMULARIO", true);
        cb=new configBanco(m, "INFORMACION", true);
        if ((e.getSource() == frameBanco.getAnadirCuenta())) {
            fb.setVisible(true);


        }
        if(e.getSource()==frameBanco.getConsultarCuentas()){
            cb.setVisible(true);
        }
    }
}