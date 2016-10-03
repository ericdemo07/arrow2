package com.arrow.internal.currencyratemanager.model;

import com.arrow.internal.currencyratemanager.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ayush.shukla on 10/3/2016.
 */
public class CurrencyModel {
    private List<Observer> observers = new ArrayList<Observer>();
    private Map currencyMap;

    public Map getRate() {
        return currencyMap;
    }

    public void setRate(Map<String, String> currencyMap) {
        this.currencyMap = currencyMap;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.refresh();
        }
    }
}
