package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class smileyFace extends Application
{
    public void start(Stage stage)
    {
        //creates and configure the main circle for the face
        Circle face=new Circle(125,125,80);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.RED);
        //create and configure the face for the right face
        Circle rightEye=new Circle(86,100,10);
        rightEye.setFill(Color.YELLOW);
        rightEye.setStroke(Color.BLUE);
        //create and configure the face for the left face
        Circle leftEye=new Circle(162,100,10);
        leftEye.setFill(Color.YELLOW);
        leftEye.setStroke(Color.BLUE);
        //create and configure the smiling mouth
        Arc mouth=new Arc(125,150,45,35,0,-180);
        mouth.setFill(Color.YELLOW);
        mouth.setStroke(Color.RED);
        mouth.setType(ArcType.OPEN);
        //create and configure the text
        Text caption=new Text(80,240,"smiley face");
        caption.setFill(Color.RED);
        caption.setFont(Font.font("Verdana",15));

        Group root=new Group(face,rightEye,leftEye,mouth,caption);
        Scene scene=new Scene(root,250,275,Color.YELLOW);
        stage.setScene(scene);
        stage.setTitle("smiley face");
        stage.show();

    }
    public static void main(String []args)
    {
        launch(args);
    }
}
