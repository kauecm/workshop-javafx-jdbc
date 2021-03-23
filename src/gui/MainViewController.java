package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem cadastro;
	
	@FXML
	private MenuItem produto;
	
	@FXML
	private MenuItem about;
	
	@FXML
	public void onMenuItemCadastroAction() {
		System.out.println("onMenuItemCadastroAction");
	}
	
	@FXML
	public void onMenuItemProdutoAction() {
		System.out.println("onMenuItemProdutoAction");
	}
	
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutAction");
	}
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
