package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {
	
	@FXML
	private Button btnSave;
	
	@FXML
	private Button btnCancel;
	
	@FXML
	private TextField idText;
	
	@FXML
	private TextField nameText;
	
	@FXML
	private Label mensageError;
	
	@FXML
	public void onBtnSaveAction() {
		System.out.println("onBtnSaveAction");
	}
	
	@FXML
	public void onBtnCancelAction() {
		System.out.println("onBtnCancelAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializableNodes();
	}
	
	private void initializableNodes() {
		Constraints.setTextFieldDouble(idText);
		Constraints.setTextFieldMaxLength(nameText, 30);
	}

}
