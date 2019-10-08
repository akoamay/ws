package akoamay.cell;

import java.awt.*;
import java.awt.event.*;

class SimulationCanvas extends Canvas implements MouseListener {

    int len = 8;
    int w;
    int h;
    Cell[] cells = new Cell[len * len];

    public SimulationCanvas(int w, int h) {
        setBackground(Color.white);
        addMouseListener(this);
        this.w = w;
        this.h = h;

        for (int i = 0; i < len; i++) {
            cells[i] = new Cell();
        }

    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}