package src.main;
public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game(){
        this.gamePanel = new GamePanel();
        this.gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        

    }
}
