package vista.componentes;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class txtNumeroReal extends JTextField implements KeyListener {
    protected int tamano;

    public txtNumeroReal(){
        this(3);
    }
    public txtNumeroReal(int tamano){
        this.tamano=tamano;
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        if(this.getText().length()==tamano){
            e.consume();
            return;
        }
        if("123456789".indexOf(e.getKeyChar())==-1){
            e.consume();
            return;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
