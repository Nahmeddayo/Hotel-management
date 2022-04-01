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
import login.aboutus;
import login.Hotel;
import login.Booking;



public class login {
	static Booking ac2;
	 static Hotel ac1;
	static aboutus ac;
	static Stage window;
    static Scene  scene4, scene5,scene6;
    Button emer,logout,aboutus;
    private static final String STANDARD_BUTTON_STYLE = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: #000000;-fx-text-fill: WHITE;";
	  private static final String HOVERED_BUTTON_STYLE  = "-fx-background-radius: 30, 30, 29, 28;-fx-padding: 3px 10px 3px 10px;-fx-background-color: transparent;-fx-text-fill: BLACK;";
	  
	  public login(){
		  window = new Stage();
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
		        
		        
		        
		        logout = new Button("Logout");		        logout.setTranslateX(400);
		        logout.setTranslateY(40);
		        logout.setPrefSize(80, 20);
		        changeBackgroundOnHover(logout);
		        
		        logout.setOnAction(new EventHandler <ActionEvent>() {

					public void handle(ActionEvent event) {
						ac1 = new Hotel();
						window.close();
					}
		    		
		    	});
		    	        	    	

		        
		        
		        
		        
		        emer = new Button("Room Booking");
		        emer.setTranslateX(150);
		        emer.setTranslateY(200);
		        emer.setPrefSize(150,40);
		        changeBackgroundOnHover(emer);
emer.setOnAction(new EventHandler<ActionEvent>() {
			        
		            public void handle(ActionEvent event) {
		            	ac2 = new Booking();
		            	window.close();
		                
		            }});
						
		        
		        
		        
		        
		        
		        
		        
		        aboutus = new Button("About Us");
		        aboutus.setTranslateX(20);
		        aboutus.setTranslateY(40);
		        aboutus.setPrefSize(80, 20);
		        changeBackgroundOnHover(aboutus);
		        
		        
		        ImageView bkg1 = new ImageView(new Image("file:images/3.jpg"));
	        	bkg1.setFitWidth(500);
	        	bkg1.setFitHeight(500);
	        	bkg1.setX(0);
	        	bkg1.setY(0);
	
		        
		       
		        aboutus.setOnAction(new EventHandler<ActionEvent>() {
			        
		            public void handle(ActionEvent event) {
		            	ac = new aboutus();
		            	window.close();
		                
		            }});
						

		        


		        
		        
		        Group loginlayout = new Group();
		        loginlayout.getChildren().addAll(bkg1,label,logout,aboutus,emer);
				scene4 = new Scene(loginlayout,490,490);
				window.setScene(scene4);
				window.show();
				
				
				
				
				    
			        
			       


			        
			        
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
  			    );}}



	
		        



