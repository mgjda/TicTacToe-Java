import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameLogic implements ActionListener {
    ArrayList<Field> fieldButtons;

    public GameLogic(ArrayList<Field> fieldButtons){
        this.fieldButtons = fieldButtons;
        for (Field button: fieldButtons) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        for (Field button: fieldButtons) {
            if(source == button){
                //System.out.println("click!"+button.getiD());
                button.setSymbol("X");
            }
        }
    }
}
