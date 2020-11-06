package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {
    private ArrayList<String> holdsNums = new ArrayList<>();
    private String num1 = "";
    private String num2 = "";






    @FXML
    private Label num1Text;
    @FXML
    private Label equationText;
    @FXML
    private Label num2Text;
    @FXML
    private Label answerText;



    public void handle(ActionEvent actionEvent) {

        if (holdsNums.isEmpty()) {
            num1 += "0";
            num1Text.setText(num1);

        }
        else {
            num2 += "0";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);

    }

    public void numOne(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "1";
            num1Text.setText(num1);
        }
        else {
            num2 += "1";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numTwo(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "2";
            num1Text.setText(num1);
        }
        else {
            num2 += "2";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numThree(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "3";
            num1Text.setText(num1);
        }
        else {
            num2 += "3";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numFour(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "4";
            num1Text.setText(num1);
        }
        else {
            num2 += "4";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numFive(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "5";
            num1Text.setText(num1);
        }
        else {
            num2 += "5";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numSix(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "6";
            num1Text.setText(num1);
        }
        else {
            num2 += "6";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numSeven(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "7";
            num1Text.setText(num1);
        }
        else {
            num2 += "7";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numEight(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "8";
            num1Text.setText(num1);
        }
        else {
            num2 += "8";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }
    public void numNine(ActionEvent actionEvent) {
        if (holdsNums.isEmpty()) {
            num1 += "9";
            num1Text.setText(num1);
        }
        else {
            num2 += "9";
            num2Text.setText(num2);
        }
        System.out.println("num 1 = " + num1 + " Num2 = " + num2);
    }

    public void addNums(ActionEvent actionEvent) {
        if (num1.isEmpty()) {
            equationText.setText("+");
            holdsNums.add(num2);
        }
        else {
            holdsNums.add(num1);
            equationText.setText("+");
        }
    }

    public void subtractNums(ActionEvent actionEvent) {
        if (num1.isEmpty()) {
            equationText.setText("-");
            holdsNums.add(num2);


        }
        else {
            holdsNums.add(num1);
            equationText.setText("-");


        }
    }

    public void divideNums(ActionEvent actionEvent) {
        if (num1.isEmpty()) {
            equationText.setText("÷");
            holdsNums.add(num2);


        }
        else {
            holdsNums.add(num1);
            equationText.setText("÷");


        }
    }

    public void multiplyNums(ActionEvent actionEvent) {
        if (num1.isEmpty()) {
            equationText.setText("X");
            holdsNums.add(num2);


        }
        else {
            holdsNums.add(num1);
            equationText.setText("X");


        }
    }

    public void equals(ActionEvent actionEvent) {
        Double sum = 0.0;
        if (equationText.getText() == "+") {
            if (!num1.isEmpty() && !num2.isEmpty()) {
                sum += Double.parseDouble(num1) + Double.parseDouble(num2);
                holdsNums.clear();
                num1 = "";
                num2 = "";
                answerText.setText(String.valueOf(sum));
            }
        }
        else if ((equationText.getText() == "-")) {
            if (!num1.isEmpty() && !num2.isEmpty()) {
                sum += Double.parseDouble(num1) - Double.parseDouble(num2);
                holdsNums.clear();
                num1 = "";
                num2 = "";
                answerText.setText(String.valueOf(sum));
            }
        }
        else if (equationText.getText() == "÷") {
            if (!num1.isEmpty() && !num2.isEmpty()) {
                sum += Double.parseDouble(num1) / Double.parseDouble(num2);
                holdsNums.clear();
                num1 = "";
                num2 = "";
                answerText.setText(String.valueOf(sum));
            }
        }
        else if (equationText.getText() == "X") {
            if (!num1.isEmpty() && !num2.isEmpty()) {
                sum += Double.parseDouble(num1) * Double.parseDouble(num2);
                holdsNums.clear();
                num1 = "";
                num2 = "";
                answerText.setText(String.valueOf(sum));


            }
        }



    }
    public void clear(ActionEvent actionEvent) {
        num1 = "";
        num2 = "";
        if (!holdsNums.isEmpty()) {
            holdsNums.clear();
        }
        num1Text.setText("");
        num2Text.setText("");
        equationText.setText("");
        answerText.setText("");

    }


}
