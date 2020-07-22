import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class GameLogic implements ActionListener {
    ArrayList<Field> fieldButtons;
    GameGUI frame;
    PlayerX playerX;
    PlayerO playerO;

    public GameLogic(GameGUI frame, ArrayList<Field> fieldButtons){
        this.fieldButtons = fieldButtons;
        this.frame = frame;
        playerX = new PlayerX();
        playerO = new PlayerO();
        for (Field button: fieldButtons) {
            button.addActionListener(this);
        }
    }

    // Check if all fields are filled.
    private boolean isGridFull(){
        for (Field button : fieldButtons) {
            if (button.getText().equals(" "))
                return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        for (Field button: fieldButtons) {
            if(source == button){
                if(playerX.isMove()==true){
                    button.setSymbol(playerX.getSymbol());
                    playerX.switchMove();
                    playerO.switchMove();
                }else{
                    button.setSymbol(playerO.getSymbol());
                    playerX.switchMove();
                    playerO.switchMove();
                }
            }
        }
        if(isGridFull()){
            //gameOverDialog();
        }
    }

    private void gameOverDialog() {
        //ImageIcon icon = new ImageIcon("");
        StringBuilder sb = new StringBuilder();
        sb.append("The winner is playerX");
        String message = sb.toString();
        Object[] options = {"Restart",
                "Exit"};
        int n = JOptionPane.showOptionDialog(frame,
                message,
                "Game Over!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title
    }
}
