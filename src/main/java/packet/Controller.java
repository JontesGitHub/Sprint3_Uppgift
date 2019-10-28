package packet;

import java.io.IOException;
import java.util.EventListener;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Label blank;

    public void clickToRestart(){
        System.out.println("funka");
    }

    public void changePlace(ActionEvent e){
        Button temp = (Button) e.getSource();
        System.out.println("funka");
    }
}