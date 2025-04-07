package com.example.javafxmvvm.viewmodel;

import com.example.javafxmvvm.model.NumberModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class NumberViewModel {

    private NumberModel numberView;

    private SimpleStringProperty numberString = new SimpleStringProperty();

    public NumberViewModel(NumberModel numberModel){
        this.numberView = numberModel;
        numberString.bind(numberModel.numberProperty().asString());
    }

    public StringProperty numberStringProperty(){
        return numberString;
    }

    public void incrementNumber(){
        numberView.setNumber(numberView.getNumber() + 1);
    }

    public void decrementNumber(){
        numberView.setNumber(numberView.getNumber() - 1);
    }

    public void doubleNumber(){
        numberView.setNumber(numberView.getNumber() * 2.0);
    }

    public void halfNumber(){
        numberView.setNumber(numberView.getNumber() / 2.0);
    }

    public void resetNumber(){
        numberView.setNumber(0);
    }
}
