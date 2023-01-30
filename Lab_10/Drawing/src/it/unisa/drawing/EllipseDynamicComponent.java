package it.unisa.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class EllipseDynamicComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D gg = (Graphics2D) g;

        Ellipse2D.Double ell = new Ellipse2D.Double(
                0, 0,
                getWidth(),  getHeight()
        );
        gg.setColor(Color.BLUE);
        gg.fill(ell);
        gg.draw(ell);

        gg.setColor(Color.BLACK);
        gg.drawString("Ridimensiona a piacimento", getWidth()/2 - getWidth()/10,getHeight()/2);
    }
}
