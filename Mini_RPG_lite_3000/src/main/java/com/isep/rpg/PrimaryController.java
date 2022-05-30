package com.isep.rpg;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchtoPlayer() throws IOException {
        Main.setRoot("Player");
    }
}