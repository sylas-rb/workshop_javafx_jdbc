package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.Initializable;
import javafx.util.Callback;
import model.Entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("Seller");
    }

    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("Department");
    }

    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("About");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }
}
