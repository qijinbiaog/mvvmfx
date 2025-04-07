package com.example.javafxmvvm;

import com.example.javafxmvvm.view.NumberModel;
import com.example.javafxmvvm.viewmodel.NumberViewModel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class NumberView extends Application {

    private NumberViewModel numberViewModel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        NumberModel numberModel = new NumberModel();

        numberViewModel = new NumberViewModel(numberModel);

        Label numberLabel = new Label();
        numberLabel.textProperty().bind(numberViewModel.numberStringProperty());
        //加
        Button incrementButton = new Button("increment");
        incrementButton.setOnAction(e -> numberViewModel.incrementNumber());
        //减
        Button decrementButton = new Button("decrement");
        decrementButton.setOnAction(e -> numberViewModel.decrementNumber());
        //乘
        Button doubleNumber = new Button("doubleNumber");
        doubleNumber.setOnAction(e -> numberViewModel.doubleNumber());
        //除
        Button halfNumberButton = new Button("halfNumber");
        halfNumberButton.setOnAction(e -> numberViewModel.halfNumber());
        //重置
        Button resetButton = new Button("reset");
        resetButton.setOnAction(e -> numberViewModel.resetNumber());

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(numberLabel, incrementButton, decrementButton,doubleNumber,halfNumberButton,resetButton);

        Scene scene = new Scene(vBox, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("number javafx MVVM");
        primaryStage.show();
    }
}
