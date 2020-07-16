import javax.swing.*;
import java.util.ArrayList;

public class StartGame {
    public static void main(String[] args) {
        ArrayList<Field> fieldButtons;

        GameGUI mainWindow = new GameGUI("Tic Tac Toe",
                450,450,50,50);
        mainWindow.setVisible(true);

        fieldButtons = mainWindow.getFieldButtons();

        GameLogic gameLogic = new GameLogic(fieldButtons);

        IPlayer playerX = new PlayerX();
        IPlayer playerY = new PlayerY();
    }
}
