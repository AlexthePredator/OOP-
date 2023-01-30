package it.unisa.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*CircleComponent circle = new CircleComponent(100, 0, 0);
        frame.add(circle);*/

        /*CircleComponent dbcircle = new CircleComponent(new Color(255, 0, 0, 255),
                new Color(253, 0, 253),
                200, 0,0);
        frame.add(dbcircle);*/

        /*ColoredSquareComponent square = new ColoredSquareComponent(Color.BLUE);
        frame.add(square);*/

        EllipseDynamicComponent ell = new EllipseDynamicComponent();
        frame.add(ell);

        frame.setVisible(true);

    }
}