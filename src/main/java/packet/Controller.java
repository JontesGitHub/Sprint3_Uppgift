package packet;

import java.io.IOException;
import java.util.EventListener;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {
    public Label blank;
    public int blankColumn = 3;
    public int blankRow = 3;
    public Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15;
    public GridPane gridPane;



    public void clickToRestart(){
        System.out.println("funka");
    }

    public void changePlace(ActionEvent e){
        int tempColumn = gridPane.getColumnIndex((Button) e.getSource());
        int tempRow = gridPane.getRowIndex((Button) e.getSource());
        System.out.println(tempColumn);
        System.out.println(tempRow);


        if (true) {
            swopPlace((Button) e.getSource(), tempColumn, tempRow);
        }
    }
    private void swopPlace(Button button, int columnIndex, int rowIndex) {
        gridPane.setColumnIndex(button, blankColumn);
        gridPane.setRowIndex(button, blankRow);

        gridPane.setColumnIndex(blank, (blankColumn = columnIndex));
        gridPane.setRowIndex(blank, (blankRow = rowIndex));
    }

}