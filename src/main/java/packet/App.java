package packet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GameView.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Thy One and Only Game");
    }

    public static void main(String[] args) {
        launch();
    }

    public static void winnerView() {
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(App.class.getResource("WinnerView.fxml"));
        } catch (IOException io) {
            io.printStackTrace();
            System.exit(0);
        }
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Winner Winner, Chicken Dinner");
    }

}