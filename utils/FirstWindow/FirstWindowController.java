package FirstWindow;


import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class FirstWindowController {
	//views
		@FXML private Button komplizierButton,einfachButton, Deutsch, Englisch;
		@FXML private TextField einfachTextfeld, kommpliziertTextfeld, Sprachwahl;
		
		public Main Main;
		

		public void setMain(Main Main) {
			this.Main=Main;
		}
	

		

		@FXML
		public void handleEinfacherButton() {
			
			
		}



				
}