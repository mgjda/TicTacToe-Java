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
        this.setText(symbol);
    }

    public int getiD() {
        return iD;
    }
}
