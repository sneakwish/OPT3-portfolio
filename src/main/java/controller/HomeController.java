package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import model.Lid;

public class HomeController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableView<Lid> tableview;

    @FXML
    private TableColumn<Lid, String> kolomNaam;

    @FXML
    private TableColumn<Lid, String> kolomGetraind;

    @FXML
    private TableColumn<Lid, String> kolomBetaald;

    @FXML
    private Button bericht;

    @FXML
    void goBericht(ActionEvent event) {
        Alert berichtAlert = new Alert(Alert.AlertType.INFORMATION);
        berichtAlert.setTitle("Bericht");

        Label label1 = new Label("Name:");
        TextField textField = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField);
        hb.setSpacing(10);

        berichtAlert.setHeaderText("Contactgegevens" + hb);

        berichtAlert.showAndWait();

    }

    @FXML
    private Button contact;

    @FXML
    void goContact(ActionEvent event) {
        Alert contactAlert = new Alert(Alert.AlertType.INFORMATION);
        contactAlert.setTitle("contactgegevens");
        contactAlert.setHeaderText("Contactgegevens: Wishal");
        ArrayList<Lid> list = new ArrayList<Lid>();
        ObservableList<Lid> observableList = FXCollections.observableList(list);

        for(Lid leden : getleden()){
            contactAlert.setContentText("Naam: " + leden.getNaam() +"\n" +
                                "Adres: " + leden.getAdres() +"\n" +
                                "Telefoon: " + leden.getTelefoon() +"\n" +
                                "Email: " + leden.getEmail());

        }
        contactAlert.showAndWait();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        kolomNaam.setCellValueFactory(new PropertyValueFactory<Lid, String> ("naam"));
        kolomGetraind.setCellValueFactory(new PropertyValueFactory<Lid, String> ("getraind"));
        kolomBetaald.setCellValueFactory(new PropertyValueFactory<Lid, String> ("betaald"));
        tableview.setItems(getleden());


    }

    public ObservableList<Lid> getleden(){
        ObservableList<Lid> leden = FXCollections.observableArrayList();
        Lid lid1 = new Lid("Kevin", 15, "Beverstraat 8", 0637234252, true, "kevin@gmail.com");
        Lid lid2 = new Lid("Marta", 15, "Riederlaan 33", 0637234252, true, "Marta@gmail.com");
        Lid lid3 = new Lid("Wishal", 21, "Kragenweg 23", 0637234252, true, "Wishal@gmail.com");

        lid1.setGetraind("02-05-2021");
        lid2.setGetraind("02-05-2021");
        lid3.setGetraind("04-05-2021");

        lid1.setBetaald("Niet Betaald!");
        lid2.setBetaald("Niet Betaald");
        lid3.setBetaald("Betaald! (€50,-)");

        leden.add(lid1);
        leden.add(lid2);
        leden.add(lid3);

        return leden;
    }
}
