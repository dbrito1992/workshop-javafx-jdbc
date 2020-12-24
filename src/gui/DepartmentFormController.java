package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {
	
	private Department entity;
	
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
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
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
	
	public void updateFormDate() {
		if(entity == null) {
			throw new IllegalStateException("Entity was null!!");
		}
		idText.setText(String.valueOf(entity.getId()));
		nameText.setText(String.valueOf(entity.getName()));
	}

}
