package gui.util;

import javafx.scene.control.Alert;

public class Alerts {
    public static void showAlert(String title, String heaader, String content, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(heaader);
        alert.setContentText(content);
        alert.show();
    }
}
