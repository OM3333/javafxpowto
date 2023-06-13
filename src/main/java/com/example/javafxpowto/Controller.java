package com.example.javafxpowto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Slider radiusSlider;
    @FXML
    private Canvas canvas;

    public double getRadius(){
        return radiusSlider.getValue();
    }

    @FXML
    public void onStartServerClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void onConnectClicked(ActionEvent actionEvent) {
    }

    public void createCircle(double x, double y){
        x-=getRadius();
        y-=getRadius();
        canvas.getGraphicsContext2D().setFill(colorPicker.getValue());
        canvas.getGraphicsContext2D().fillOval(x,y,getRadius()*2,getRadius()*2);
    }

    @FXML
    public void onMouseClicked(MouseEvent actionEvent){
        createCircle(actionEvent.getX(), actionEvent.getY());
    }
}
