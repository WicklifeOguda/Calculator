package com.codenawikie.calculator;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class MyCalcController {
    @FXML private Label answerLabel;

    private double num1 = 0;
    private String operator = "+";

    @FXML
    void onNumberClicked(MouseEvent event){
        //System.out.println("Number Clicked");
        try {
            int value = Integer.parseInt(((Label)event.getSource()).getId().replace("button",""));
            answerLabel.setText(Double.parseDouble(answerLabel.getText()) == 0 ? String.valueOf((double)value) : String.valueOf(Double.parseDouble(answerLabel.getText())*10+value));

        }catch (Exception e){
            System.out.println(e);
        }

    }



    @FXML
    void onSymbolClicked(MouseEvent event){
        //System.out.println("Symbol cliked");
        String symbol = ((Label)event.getSource()).getId().replace("button","");
        if(symbol.equals("Equals")){

            double num2 = Double.parseDouble(answerLabel.getText());
            switch (operator){
                case "+" -> answerLabel.setText((num1 + num2) +"");
                case "-" -> answerLabel.setText((num1 - num2) +"");
                case "*" -> answerLabel.setText((num1 * num2) +"");
                case "/" -> answerLabel.setText((num1 / num2) +"");

            }
            operator = ".";
        }
        else if (symbol.equals("Clear")){

        }
        else{
            switch (symbol){
                case "Divide" -> operator = "/";
                case "Multiply" -> operator = "*";
                case "Add" -> operator = "+";
                case "Minus" -> operator = "-";
                case "Point" -> operator = ".";
            }
            num1 = Double.parseDouble(answerLabel.getText());
            answerLabel.setText(String.valueOf(0.0));
        }
    }




    @FXML
    void onCommandClicked(MouseEvent event){
       //
        // System.out.println("Command clicked");
        String symbol = ((Label)event.getSource()).getId().replace("button","");
        if (symbol.equals("ClearAll")){
            answerLabel.setText(String.valueOf(0.0));
            operator = ".";

        }
        else if (symbol.equals("Clear")){
            //implement
            System.out.println("Last digit deleted");
        }

    }

}