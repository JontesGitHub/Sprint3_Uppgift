package packet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
    private List<Object> lista = new ArrayList<>();

    public void clickToRestart(){
        System.out.println("funka");
        addToList();
        shuffleBoard();
    }
    private void addToList(){
        lista.add(button1);
        lista.add(button2);
        lista.add(button3);
        lista.add(button4);
        lista.add(button5);
        lista.add(button6);
        lista.add(button7);
        lista.add(button8);
        lista.add(button9);
        lista.add(button10);
        lista.add(button11);
        lista.add(button12);
        lista.add(button13);
        lista.add(button14);
        lista.add(button15);
        lista.add(blank);
    }

    private void shuffleBoard(){
        Collections.shuffle(lista);
        System.out.println("shuffling board");
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

        hasWon();

    }
    private void hasWon(){
        if ((gridPane.getColumnIndex(blank) == 3 && gridPane.getRowIndex(blank) == 3) &&
                (gridPane.getColumnIndex(button1) == 0 && gridPane.getRowIndex(button1) == 0) &&
                (gridPane.getColumnIndex(button2) == 1 && gridPane.getRowIndex(button2) == 0) &&
                (gridPane.getColumnIndex(button3) == 2 && gridPane.getRowIndex(button3) == 0) &&
                (gridPane.getColumnIndex(button4) == 3 && gridPane.getRowIndex(button4) == 0) &&
                (gridPane.getColumnIndex(button5) == 0 && gridPane.getRowIndex(button5) == 1) &&
                (gridPane.getColumnIndex(button6) == 1 && gridPane.getRowIndex(button6) == 1) &&
                (gridPane.getColumnIndex(button7) == 2 && gridPane.getRowIndex(button7) == 1) &&
                (gridPane.getColumnIndex(button8) == 3 && gridPane.getRowIndex(button8) == 1) &&
                (gridPane.getColumnIndex(button9) == 0 && gridPane.getRowIndex(button9) == 2) &&
                (gridPane.getColumnIndex(button10) == 1 && gridPane.getRowIndex(button10) == 2) &&
                (gridPane.getColumnIndex(button11) == 2 && gridPane.getRowIndex(button11) == 2) &&
                (gridPane.getColumnIndex(button12) == 3 && gridPane.getRowIndex(button12) == 2) &&
                (gridPane.getColumnIndex(button13) == 0 && gridPane.getRowIndex(button13) == 3) &&
                (gridPane.getColumnIndex(button14) == 1 && gridPane.getRowIndex(button14) == 3) &&
                (gridPane.getColumnIndex(button15) == 2 && gridPane.getRowIndex(button15) == 3)){
            System.out.println("du vann");
            // fixa en till fxml som hoppar upp (via App, o ny fxml fil)
        }
    }

}