import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {
        ArrayList<Field> fieldButtons;

        GameGUI mainWindow = new GameGUI("TicTacToe",
                450,450,50,50);
        mainWindow.setVisible(true);

        fieldButtons = mainWindow.getFieldButtons();

        GameLogic gameLogic = new GameLogic(mainWindow, fieldButtons);

    }
}
