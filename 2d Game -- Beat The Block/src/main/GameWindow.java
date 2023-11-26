package src.main;

import javax.swing.JFrame;

public class GameWindow{
    private JFrame frame;
    public GameWindow(GamePanel gamePanel){
        //Set up frame
        frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add to frame
        frame.add(gamePanel);
        //What's Visibile?
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
