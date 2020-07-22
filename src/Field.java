import javax.swing.*;
import java.awt.*;

public class Field extends JButton {
    private int iD;

    public Field(String text){
        super(" ");
        this.iD = Integer.parseInt(text);
    }

    public void changeColor(){
        setBackground(Color.GREEN);
    }

    public void setSymbol(String symbol){
        // If symbol is not " " then block event on the field
        if(getText() == " ") {
            this.setText(symbol);
        }
    }

    public int getiD() {
        return iD;
    }
}
