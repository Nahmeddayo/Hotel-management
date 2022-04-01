package login;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import login.login;
public class aboutus {
	
	static login ac;
	static Stage window;
    static Scene scene8;
   static Button goback;
    private static final String STANDARD_BUTTON_STYLE = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: #000000;-fx-text-fill: WHITE;";
	  private static final String HOVERED_BUTTON_STYLE  = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: transparent;-fx-text-fill: BLACK;";
	public aboutus(){
		window = new Stage();

	Group about = new Group();
	scene8 = new Scene(about,490,490,Color.WHITE);
	window.setScene(scene8);
	window.setTitle("Motel");
	window.setResizable(false);
	window.getIcons().add(new Image("/15.png"));
	Label label1 = new Label("Motel");
	 Image img1 = new Image("15.png");
        ImageView view1 = new ImageView(img1);
        view1.setFitHeight(80);
        Font font1 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
	      label1.setFont(font1);
	      label1.setTextFill(Color.BLACK);
	      view1.setPreserveRatio(true);
        label1.setGraphic(view1);
        label1.setTranslateX(150);
        label1.setTranslateY(25);
        
        Label label2 = new Label("About Us");
        Font font2 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
        label2.setFont(font2);
  	      label2.setTextFill(Color.BLACK);
  	    label2.setTranslateX(150);
        label2.setTranslateY(120);
      
        Label label3 = new Label("Noman Zahoor 53062\nQadeer Ahmed Shaikh 53060\nMir Arbaaz Hanif 53418\nTaqi Charolia 51998\n Talha Sakhawat 53098 ");
        Font font3 = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 25);
        label3.setFont(font3);
  	      label3.setTextFill(Color.BLACK);
  	    label3.setTranslateX(150);
        label3.setTranslateY(180);
      

        
        
        
        
        goback = new Button("Go Back");
        goback.setTranslateX(20);
        goback.setTranslateY(40);
        goback.setPrefSize(80, 20);
        changeBackgroundOnHover(goback);
        
        ImageView bkg1 = new ImageView(new Image("file:images/4.jpg"));
    	bkg1.setFitWidth(500);
    	bkg1.setFitHeight(500);
    	bkg1.setX(0);
    	bkg1.setY(0);
        
        goback.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				ac = new login();
			}
        	
        });
        
        
        window.show();

        
        about.getChildren().addAll(bkg1,label1,label2,label3,goback);


}
static void changeBackgroundOnHover(Button bt) {
bt.styleProperty().bind(
	      Bindings
	        .when(bt.hoverProperty())
	          .then(
	            new SimpleStringProperty(HOVERED_BUTTON_STYLE)
	          )
	          .otherwise(
	            new SimpleStringProperty(STANDARD_BUTTON_STYLE)
	          )
	    );}



}
