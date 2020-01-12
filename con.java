package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.io.*;
import java.nio.Buffer;

public class Controller {

    @FXML private Button btnOk;
    @FXML private TextField txtLogin;
    @FXML private TextField txtHaslo;
    @FXML private Text txtKomunikat;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if((txtLogin.getText().equals("miq")) && (txtHaslo.getText().equals("miq"))) {
            txtKomunikat.setFill(Color.GREEN);
            txtKomunikat.setText("Zalogowano!");
        }
        else {
            txtKomunikat.setFill(Color.RED);
            txtKomunikat.setText("Niepoprawny login lub hasło");
        }
        sprawdzLogin("miq", "miq");
    }

    private int sprawdzLogin(String userLogin, String userHaslo) {
        String currentLine;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/sample/users.txt"));
            currentLine = reader.readLine();
            System.out.println(currentLine);
        }
        catch (IOException e) {
            System.out.println("Nie znaleziono pliku");
        }
        return 1;
    }

}
