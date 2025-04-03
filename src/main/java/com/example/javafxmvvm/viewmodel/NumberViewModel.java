package com.example.javafxmvvm.viewmodel;

import com.example.javafxmvvm.view.NumberView;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class NumberViewModel {

    private NumberView numberView;

    private SimpleStringProperty numberString = new SimpleStringProperty();

    public NumberViewModel(NumberView numberView){
        this.numberView = numberView;
        numberString.bind(numberView.numberProperty().asString());
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
