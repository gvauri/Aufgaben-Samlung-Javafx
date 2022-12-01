package com.example.aufgabensammlungjavafx;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerRechner {
    Rechteck rechteck = new Rechteck();
    @FXML
    private TextField breiteRechteck;

    @FXML
    private TextField hoheRechteck;

    @FXML
    private TextField result;

    @FXML
    protected void checkRechteck() {
        try {
        rechteck.setHeight(Double.parseDouble(hoheRechteck.getText()));
        rechteck.setWidth(Double.parseDouble(breiteRechteck.getText()));
        result.setText(Double.toString(rechteck.getArea()));
    }catch (Exception ex){
            hoheRechteck.setStyle("-fx-text-inner-color: red;");
            breiteRechteck.setStyle("-fx-text-inner-color: red;");
        }


    }
    @FXML
    protected void quit() {
        System.exit(0);
    }
}

class Rechteck {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double value) {
        System.out.println(value);
        height = value;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double value) {
        System.out.println(value);
        width = value;
    }
    public boolean checkEingabe() {
        if (height==0){
            if (width==0){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public double getArea() {
        return height * width;
    }
}