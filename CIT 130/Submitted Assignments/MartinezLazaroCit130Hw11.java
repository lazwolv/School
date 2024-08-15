/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw11.java
@version The date as 2024-05-04
@note Time taken 1 hour
@program this program creates 2 perpendicular lines, creates a circle at the end of each line
and at the intersection point of the lines. Then adds 4 texts/labels at each quadrant.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MartinezLazaroCit130Hw11 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();//create a pane
        
        //create 2 perpendicular lines
        Line line1 = new Line(250, 50, 250, 250);
        Line line2 = new Line(50, 150, 450, 150);
        
        //create a circle at the end of each line and intersection
        //give them coordinates, radius and color
        Circle circle1 = new Circle(250, 50, 10);
        circle1.setFill(Color.GREEN);
        Circle circle2 = new Circle(450, 150, 10);
        circle2.setFill(Color.BLUE);
        Circle circle3 = new Circle(250, 250, 10);
        circle3.setFill(Color.YELLOW);
        Circle circle4 = new Circle(50, 150, 10);
        circle4.setFill(Color.RED);
        Circle circle5 = new Circle(250, 150, 10);
        circle5.setFill(Color.ORANGE);
        
        //add 4 texts/labels at each quadrant
        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 12);
        Text text1 = new Text(100, 130, "I");
        text1.setFont(font);
        Text text2 = new Text(300, 130, "Enjoy");
        text2.setFont(font);
        text2.setUnderline(true);
        Text text3 = new Text(100, 190, "Programming Language");
        text3.setFont(font);
        text3.setUnderline(true);
        text3.setFill(Color.BLUE);
        Text text4 = new Text(300, 190, "Java");
        text4.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 12));
        text4.setFill(Color.RED);

        pane.getChildren().addAll(line1, line2,
        circle1, circle2, circle3, circle4, circle5,
        text1, text2, text3, text4);

        //create a scene and place it in the stage
        Scene scene = new Scene(pane, 500, 300);//create new scene
        primaryStage.setTitle("Lazaro Martinez");//set stage title
        primaryStage.setScene(scene);//add scene to stage
        primaryStage.show();//display Stage
    }
    public static void main(String[] args) {
        launch(args);
    }//main

}//class
