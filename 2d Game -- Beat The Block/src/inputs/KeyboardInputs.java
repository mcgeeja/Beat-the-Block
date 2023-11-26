package src.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import src.main.GamePanel;

public class KeyboardInputs implements KeyListener {
    
    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }
    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyReleased(KeyEvent e){
        
    }
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_A){
            System.out.println("a is pressed");
            gamePanel.changexDelta(-20);
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
            System.out.println("S is pressed");
            gamePanel.changeyDelta(20);
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            System.out.println("D is pressed");
            gamePanel.changexDelta(20);
        }
        if(e.getKeyCode() == KeyEvent.VK_W){
            System.out.println("W is pressed");
            gamePanel.changeyDelta(-20);
        }
    }
    
}
