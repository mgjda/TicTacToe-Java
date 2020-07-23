import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class GameLogic implements ActionListener {
    ArrayList<Field> fieldButtons;
    private String[][] fieldsBoard;
    GameGUI frame;
    PlayerX playerX;
    PlayerO playerO;

    public GameLogic(GameGUI frame, ArrayList<Field> fieldButtons){
        this.fieldButtons = fieldButtons;
        this.fieldsBoard = new String[3][3];
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

    private void setToFieldsBoard(Field button, IPlayer player){
        switch (button.getiD()){
            case 1:
                this.fieldsBoard[0][0] = player.getSymbol();
                break;
            case 2:
                this.fieldsBoard[0][1] = player.getSymbol();
                break;
            case 3:
                this.fieldsBoard[0][2] = player.getSymbol();
                break;
            case 4:
                this.fieldsBoard[1][0] = player.getSymbol();
                break;
            case 5:
                this.fieldsBoard[1][1] = player.getSymbol();
                break;
            case 6:
                this.fieldsBoard[1][2] = player.getSymbol();
                break;
            case 7:
                this.fieldsBoard[2][0] = player.getSymbol();
                break;
            case 8:
                this.fieldsBoard[2][1] = player.getSymbol();
                break;
            case 9:
                this.fieldsBoard[2][2] = player.getSymbol();
                break;
            default:
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        for (Field button: fieldButtons) {
            if(source == button){
                if(button.getText() == " "){
                    if(playerX.isMove()==true){
                        button.setSymbol(playerX.getSymbol());
                        setToFieldsBoard(button, playerX);
                        playerX.switchMove();
                        playerO.switchMove();
                    }else{
                        button.setSymbol(playerO.getSymbol());
                        setToFieldsBoard(button, playerO);
                        playerX.switchMove();
                        playerO.switchMove();
                    }
                }

            }
        }
//        for(int i = 0; i<3;i++){
//            for(int j = 0; j<3;j++){
//                System.out.print(fieldsBoard[i][j]);
//            }
//            System.out.println("");
//        }
        if(isGridFull()){
            //gameOverDialog(); // uncomment when logic will be finished
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
