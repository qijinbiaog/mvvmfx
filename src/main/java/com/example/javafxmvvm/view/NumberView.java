package com.example.javafxmvvm.view;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class NumberView {
    private DoubleProperty number = new SimpleDoubleProperty();
    public double getNumber() {
        return number.get();
    }
    public DoubleProperty numberProperty() {
        return number;
    }
    public void setNumber(double number) {
        this.number.set(number);
    }
}
