
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import login.login;

public class Hotel extends Application{





	static Stage window;
	static Scene scene1, scene2;
	static Button signup,login,login1,signup1;
	static login ac;
	 private static final String STANDARD_BUTTON_STYLE = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: #000000;-fx-text-fill: WHITE;";
	  private static final String HOVERED_BUTTON_STYLE  = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: transparent;-fx-text-fill: BLACK;";
	  
	  
	  String user = "noman", pass = "12345",mnum="03113569698",email1="Noman@gmail.com";

	 
	  public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
		  window = primaryStage;
			window.setTitle("Motel");
			window.setResizable(false);
			window.getIcons().add(new Image("/15.png"));
			Label label = new Label("Motel");
			 Image img = new Image("15.png");
		        ImageView view = new ImageView(img);
		        view.setFitHeight(80);
		        Font font = Font.font("Brush Script MT", FontWeight.BOLD,FontPosture.REGULAR, 40);
	  	      label.setFont(font);
	  	      label.setTextFill(Color.BLACK);
	  	      view.setPreserveRatio(true);
		        label.setGraphic(view);
		        label.setTranslateX(150);
		        label.setTranslateY(25);

		        
		        final TextField txtUserName = new TextField();
			      
		        txtUserName .setPromptText("User Name");
		        txtUserName.setStyle("-fx-background-color:transparent;-fx-border-radius: 1;-fx-prompt-text-fill:black ;");
		        txtUserName.setTranslateX(190);
		        txtUserName.setTranslateY(200);
		        txtUserName.setPrefWidth(230);
		        txtUserName.setPrefHeight(35);
		        txtUserName.getStylesheets().add("file:css/n.css");
		        
		        
		        final PasswordField pf = new PasswordField();
		        pf.setStyle("-fx-background-color:transparent;-fx-border-radius: 1;-fx-prompt-text-fill:black ;");
		        pf.setPromptText("Password");
		        pf.setTranslateX(190);
		        pf.setTranslateY(260);
		        pf.setPrefWidth(230);
		        pf.setPrefHeight(35);
		        pf.getStylesheets().add("file:css/n.css");
		        
		  
		        
		        
		        login = new Button("Login");
		        login.setTranslateX(200);
		        login.setTranslateY(320);
		        login.setPrefSize(80, 20);
		        changeBackgroundOnHover(login);
		        
		        signup = new Button("Signup");
		        signup.setTranslateX(300);
		        signup.setTranslateY(320);
		        signup.setPrefSize(80, 20);
		        changeBackgroundOnHover(signup);
		        
		        ImageView bkg = new ImageView(new Image("file:images/1.jpeg"));
	        	bkg.setFitWidth(500);
	        	bkg.setFitHeight(500);
	        	bkg.setX(0);
	        	bkg.setY(0);
		        signup.setOnAction(new EventHandler<ActionEvent>() {
		        
		        	
		        	
		        	
		        	
		        	
		            public void handle(ActionEvent event) {
		                window.setScene(scene2);
		            }
		        });
		        
		       login.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent event) {
						
					if(user.equals(txtUserName.getText().trim()) && pass.equals(pf.getText().trim())){	
					
						ac = new login();
						window.close();

						
					} else  
					{
						Alert error =new Alert(AlertType.ERROR);
						error.setHeaderText(null);
						error.setContentText("Enter valid Username OR password!");
						error.showAndWait();
						
					}
					
					}});
		 

	        Group root = new Group();
			root.getChildren().addAll(bkg,label,txtUserName,login,signup,pf);
			scene1 = new Scene(root,490,500);
		
			window.setScene(scene1);
			
			window.show();
			
			
			Group signupf = new Group();
			window.getIcons().add(new Image("/15.png"));
			Label label1 = new Label("Motel");
			 Image img1= new Image("15.png");
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
			      
		        txtUserName1.setPromptText("User Name");
		        txtUserName1.setStyle("-fx-background-color:transparent;-fx-border-radius: 1;-fx-prompt-text-fill:black ;");
		        txtUserName1.setTranslateX(190);
		        txtUserName1.setTranslateY(200);
		        txtUserName1.setPrefWidth(230);
		        txtUserName1.setPrefHeight(35);
		        txtUserName1.getStylesheets().add("file:css/n.css");
		        
		        final TextField Email = new TextField();
			      
		        Email.setPromptText("Email Address");
		        Email.setStyle("-fx-background-color:transparent;-fx-border-radius: 1;-fx-prompt-text-fill:black ;");
		        Email.setTranslateX(190);
		        Email.setTranslateY(260);
		        Email.setPrefWidth(230);
		        Email.setPrefHeight(35);
		        Email.getStylesheets().add("file:css/n.css");
		        
		        
		        final TextField mnumber = new TextField();
			      
		        mnumber.setPromptText("Mobile Number");
		        mnumber.setStyle("-fx-background-color:transparent;-fx-border-radius: 1;-fx-prompt-text-fill:black ;");
		        mnumber.setTranslateX(190);
		        mnumber.setTranslateY(320);
		        mnumber.setPrefWidth(230);
		        mnumber.setPrefHeight(35);
		        mnumber.getStylesheets().add("file:css/n.css");
		        
		        
		        final PasswordField pf1 = new PasswordField();
		        pf1.setStyle("-fx-background-color:transparent;-fx-border-radius: 1;-fx-prompt-text-fill:black ;");
		        pf1.setPromptText("Password");
		        pf1.setTranslateX(190);
		        pf1.setTranslateY(380);
		        pf1.setPrefWidth(230);
		        pf1.setPrefHeight(35);
		        pf1.getStylesheets().add("file:css/n.css");
		       
		        
		        
		        login1 = new Button("Login");
		        login1.setTranslateX(200);
		        login1.setTranslateY(440);
		        login1.setPrefSize(80, 20);
		        changeBackgroundOnHover(login1);
		        
		        login1.setOnAction(new EventHandler<ActionEvent>() {

		            public void handle(ActionEvent event) {
		                window.setScene(scene1);
		            }
		        });
		        
		        signup1 = new Button("Signup");
		        signup1.setTranslateX(300);
		        signup1.setTranslateY(440);
		        signup1.setPrefSize(80, 20);
		        changeBackgroundOnHover(signup1);
		        
		        ImageView bkg1 = new ImageView(new Image("file:images/2.jpg"));
	        	bkg1.setFitWidth(500);
	        	bkg1.setFitHeight(500);
	        	bkg1.setX(0);
	        	bkg1.setY(0);
		        
		        /*signup1.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent event) {
						
					if(user.equals(txtUserName1.getText().trim()) && pass.equals(pf1.getText().trim()) && mnum.equals(mnumber.getText().trim()) && email1.equals(Email.getText().trim())){	
					
						ac = new login();
						window.close();

						
					} else  
					{
						Alert error =new Alert(AlertType.ERROR);
						error.setHeaderText(null);
						error.setContentText("Enter valid Username OR password!");
						error.showAndWait();
						
					}
					
					}});*/

		        
		        
		        
		        
		        signupf.getChildren().addAll(bkg1,label1,txtUserName1,login1,signup1,pf1,mnumber,Email);
		        scene2 = new Scene(signupf,490,500,Color.WHITE);		        	
		        window.setScene(scene2);
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
		    	}
		        
		        
		   
			
		
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			launch(args);

		}

		

	}


