package checadorhorarios;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Esta clase se encarga de adaptar la interfaz MouseListener a los controladores
//y no tener que poner todos los métodos en cada clase donde sea requerida.
//Esta clase será heredada a todos los controles para que sea utilizada en el 
//botón de mayor importancia.
//Se basa en el patron de diseño "adapter".
public class Controller implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
