
package userInterface;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.border.*;

public class RoundedBorder implements Border {
    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }


    @Override
    public Insets getBorderInsets(Component c) {
       return new Insets(10,10,10,10);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
    
    public void paintBorder(Component c,Graphics g,int x, int y, int with,int height) {
    g.drawRoundRect(x, y, with-1, height-1, radius, radius);
    
    }
   
}



