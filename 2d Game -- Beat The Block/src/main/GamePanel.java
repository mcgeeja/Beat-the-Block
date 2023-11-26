package src.main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.sound.midi.SysexMessage;
import javax.swing.JPanel;

import src.inputs.KeyboardInputs;
import src.inputs.MouseInputs;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private int xDelta = 0;
    private int yDelta = 0;

    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }
    public void changexDelta(int value){
        this.xDelta += value;
        repaint();
    }
    public void changeyDelta(int value){
        this.yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(this.xDelta , this.yDelta, 200, 50);

    }
}