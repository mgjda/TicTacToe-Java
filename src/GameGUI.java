import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameGUI extends JFrame {
    private ArrayList<Field> fieldButtons;

    public GameGUI(String appTitle, int windowWidth, int windowHeight,
                   int windowLocationX, int windowLocationY){
        super(appTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(windowWidth,windowHeight);
        setLocation(windowLocationX,windowLocationY);
        setLayout(new GridLayout(3, 3));

        this.fieldButtons = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            Field newButton = new Field(String.valueOf(i));
            add(newButton);
            fieldButtons.add(newButton);
        }
    }

    public ArrayList<Field> getFieldButtons(){
        return fieldButtons;
    }
    public void setFieldButtons(ArrayList<Field> fieldButtons) { this.fieldButtons = fieldButtons;}
}
