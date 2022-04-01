package login;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Booking{
	static Scene  scene5;
	static Stage window;
	
	static Button Book;
	private static final String STANDARD_BUTTON_STYLE = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: #000000;-fx-text-fill: WHITE;";
	  private static final String HOVERED_BUTTON_STYLE  = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: transparent;-fx-text-fill: BLACK;";
	  
	public Booking(){
	window = new Stage();

	Group about = new Group();
	scene5 = new Scene(about,750,750,Color.WHITE);
	window.setScene(scene5);
	window.setTitle("Motel");
	window.setResizable(true);
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
        
        final TextField txtUserName1 = new TextField();

        
        
        txtUserName1 .setPromptText("Full Name");
        txtUserName1.setStyle("-fx-background-color: #000000 , white , white;-fx-background-insets: 0 -1 -1 -1, 0 0 0 0, 0 -2 0 -2;-fx-prompt-text-fill:gray ;");
        txtUserName1.setTranslateX(190);
        txtUserName1.setTranslateY(100);
        txtUserName1.setPrefWidth(230);
        txtUserName1.setPrefHeight(35);
        
        final TextField Age = new TextField();
        Age.setPromptText("CNIC Number");
        Age.setStyle("-fx-background-color: #000000 , white , white;-fx-background-insets: 0 -1 -1 -1, 0 0 0 0, 0 -2 0 -2;-fx-prompt-text-fill:gray ;");
        Age.setTranslateX(190);
        Age.setTranslateY(160);
        Age.setPrefWidth(230);
        Age.setPrefHeight(35);
        
        final TextField PNum = new TextField();
        PNum.setPromptText("Mobile Number");
        PNum.setStyle("-fx-background-color: #000000 , white , white;-fx-background-insets: 0 -1 -1 -1, 0 0 0 0, 0 -2 0 -2;-fx-prompt-text-fill:gray ;");
        PNum.setTranslateX(190);
        PNum.setTranslateY(220);
        PNum.setPrefWidth(230);
        PNum.setPrefHeight(35);

 
        Label l5= new Label("Gender");
		ToggleGroup tg= new ToggleGroup();
		final RadioButton r1= new RadioButton("Male");
		r1.setToggleGroup(tg);
		final RadioButton r2= new RadioButton("Female");
		r2.setToggleGroup(tg);
		HBox h5= new HBox(20);
		h5.setTranslateX(190);
		h5.setTranslateY(280);
        h5.setPrefWidth(230);
        h5.setPrefHeight(35);
		h5.getChildren().addAll(l5,r1,r2);
		

        Label l7 = new Label("City");
		final ComboBox<String> t7 = new ComboBox<String>();
		t7.getItems().addAll("Islamabad", "Lahore", "Karachi", "Hyderabad","Multan");
		t7.setPromptText("Select");
		HBox h7= new HBox(20);
		h7.setTranslateX(190);
		h7.setTranslateY(340);
        h7.setPrefWidth(230);
        h7.setPrefHeight(35);
		h7.getChildren().addAll(l7,t7);
			
		final TextField Address = new TextField();
		Address.setPromptText("Address");
		Address.setStyle("-fx-background-color: #000000 , white , white;-fx-background-insets: 0 -1 -1 -1, 0 0 0 0, 0 -2 0 -2;-fx-prompt-text-fill:gray ;");
		Address.setTranslateX(190);
		Address.setTranslateY(400);
		Address.setPrefWidth(230);
		Address.setPrefHeight(35);
		
		
		Label l8 = new Label("Room Preference");
		final ComboBox<String> t8 = new ComboBox<String>();
		t8.getItems().addAll("Standard", "Delux", "Suit");
		t8.setPromptText("Select");
		HBox h8= new HBox(20);
		h8.setTranslateX(190);
		h8.setTranslateY(460);
        h8.setPrefWidth(280);
        h8.setPrefHeight(35);

		h8.getChildren().addAll(l8,t8);
		
		
		Label l9 = new Label("Number Of Guests");
		final ComboBox<String> t9 = new ComboBox<String>();
		t9.getItems().addAll("1", "2", "3", "4","5","6","7","8","9","10");
		t9.setPromptText("Select");
		HBox h9= new HBox(20);
		h9.setTranslateX(190);
		h9.setTranslateY(520);
        h9.setPrefWidth(230);
        h9.setPrefHeight(35);
		h9.getChildren().addAll(l9,t9);
		
		final TextField HName = new TextField();
		HName.setPromptText("Hotel Name");
		HName.setStyle("-fx-background-color: #000000 , white , white;-fx-background-insets: 0 -1 -1 -1, 0 0 0 0, 0 -2 0 -2;-fx-prompt-text-fill:gray ;");
		HName.setTranslateX(190);
		HName.setTranslateY(580);
		HName.setPrefWidth(230);
		HName.setPrefHeight(35);
	
		

		

		
		
		Book = new Button("Book Now");
		Book.setTranslateX(150);
		Book.setTranslateY(620);
       Book.setPrefSize(80, 20);
        changeBackgroundOnHover(Book);
        ImageView bkg1 = new ImageView(new Image("file:images/12.jpg"));
    	bkg1.setFitWidth(750);
    	bkg1.setFitHeight(750);
    	bkg1.setX(0);
    	bkg1.setY(0);
        
        
        
		Book.setOnAction(new EventHandler<ActionEvent>()
		{

			public void handle(ActionEvent arg0) {
				String details = "";
				String g= "";
				String log ="";
				
				
				log += txtUserName1.getText() + " ";
				log += Age.getText() + " ,";
				details += txtUserName1.getText() + "";
				details += Age.getText() + ",";
				details += PNum.getText() + ",";
				details += Address.getText() + "";
				details += HName.getText() + "";
				
				
				if(r1.isSelected())
				{
					g= "Male";
				}
				
				else if(r2.isSelected())
				{
					g = "Female";
				}
				
				details += g + "Gender/n";
				
				
				
				details += t7.getSelectionModel().getSelectedItem() + "City/n";
				details += t8.getValue()+ "Emergency Type/n";
				details += t9.getSelectionModel().getSelectedItem();
				
				
				System.out.println(details);
				
				
				Alert a= new Alert(AlertType.INFORMATION);
				a.setContentText("Your Ambulance is Booked And Your Driver is on the way");
				a.setHeaderText(null);
				a.showAndWait();
				
			}
	
		});
        




        
        
        
window.show();       
 about.getChildren().addAll(bkg1,label1,txtUserName1,Age,PNum,h5,h7,Address,h8,h9,HName,Book);

	
	
	
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
		    );


}}


