import javax.swing.*;
import java.awt.*;

public class Field extends JButton {
    private int iD;
    private int row;
    private int column;

    public Field(String text){
        super(" ");
        this.iD = Integer.parseInt(text);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setPosition(int row, int column){
        this.row = row;
        this.column = column;
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

    public int getiD(int row, int column){return iD;};
}
