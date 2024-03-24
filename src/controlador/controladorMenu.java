package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;

public class controladorMenu implements ActionListener {

    vista.mainFrame framePrincipal;
    vista.panApp a;
    public controladorMenu(mainFrame framePrincipal){
        this.framePrincipal=framePrincipal;
        this.a=a;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==framePrincipal.getBotonApp()){
            framePrincipal.anadirPanel(new panApp());
            return;
        }

        if (e.getSource()==framePrincipal.getBotonServicio()){
            System.out.println("entra");
            framePrincipal.anadirPanel(new panServicio());
            System.out.println("entra");
            return;
        }
        if (e.getSource()==framePrincipal.getBotonWeb()){
            System.out.println("entra");
            framePrincipal.anadirPanel(new panWeb());
            System.out.println("entra");
            return;
        }
        if (e.getSource()==framePrincipal.getBotonBanco()){
            System.out.println("entra");
            framePrincipal.anadirPanel(new panBanco());
            System.out.println("entra");
            return;
        }
        if(e.getSource()==framePrincipal.getInicio()){
            System.out.println("gol");
            framePrincipal.anadirPanel(framePrincipal.getPanelPrincipal());
            return;
        }
        if(e.getSource()==a.getAnadirCuenta()){
            System.out.println("goool");

        }

    }
}
