package it.unisa.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleComponent extends JComponent {

    private final Ellipse2D.Double circle;
    private final Ellipse2D.Double circleBorder;
    private final Color fillColor;
    private final Color borderColor;

    public CircleComponent(float radius, float x, float y) {
        this.circle = new Ellipse2D.Double( x, y, 2*radius, 2*radius);
        this.fillColor = Color.BLACK;
        this.circleBorder = new Ellipse2D.Double( x, y, 2*radius, 2*radius);
        this.borderColor = Color.BLACK;
    }

    public CircleComponent(Color fillColor, Color borderColor, float radius, float x, float y) {
        this.circle = new Ellipse2D.Double( x, y, 2*radius, 2*radius);
        this.fillColor = fillColor;
        this.circleBorder = new Ellipse2D.Double( x+ radius, y, 2*radius, 2*radius);
        this.borderColor = borderColor;
    }

    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(fillColor);
        gg.fill(circle);
        gg.setColor(borderColor);
        gg.draw(circle);
    }

    /* TODO */
}
