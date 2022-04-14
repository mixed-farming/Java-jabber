import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class l8q1 extends Application{ 
@Override 
public void start(Stage mainStage){ 
mainStage.setTitle("This is the first JavaFX Application"); 
Label l1 = new Label("Welcome to JavaFX programming"); 
l1.setFont(new Font(20)); 
TextField tf = new TextField(); 
tf.setText(""); 
Button b1 = new Button("Display"); 
FlowPane root = new FlowPane(); 
root.setHgap(10); 
root.setVgap(10); 
l1.setTextFill(Color.MAGENTA); 
Scene s1 = new Scene(root,500,200); 
root.getChildren().addAll(l1); 
root.getChildren().addAll(tf); 
root.getChildren().addAll(b1); 
root.setAlignment(Pos.CENTER); 
b1.setOnAction(new EventHandler <ActionEvent>(){ 
@Override 
public void handle(ActionEvent arg0){ 
String s = tf.getText(); 
for(int i=1;i<=10;i++){ 
Label l = new Label(s + " X " + String.valueOf(i) + " = " + 
String.valueOf(Integer.parseInt(s)*i) + "," + "\n");
root.getChildren().addAll(l); 
} 
} 
});
mainStage.setScene(s1); 
mainStage.show(); 
} 
public static void main(String[] args) { 
launch(); 
}
}