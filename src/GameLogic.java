import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameLogic implements ActionListener {
    ArrayList<Field> fieldButtons;
    PlayerX playerX;
    PlayerO playerO;

    public GameLogic(ArrayList<Field> fieldButtons){
        this.fieldButtons = fieldButtons;
        playerX = new PlayerX();
        playerO = new PlayerO();
        for (Field button: fieldButtons) {
            button.addActionListener(this);
        }
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
    }
}
