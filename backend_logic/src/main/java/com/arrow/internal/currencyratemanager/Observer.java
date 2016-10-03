package com.arrow.internal.currencyratemanager;

import com.arrow.internal.currencyratemanager.model.CurrencyModel;

/**
 * Created by ayush.shukla on 10/3/2016.
 */
public abstract class Observer {
    protected CurrencyModel currencyModel;

    public abstract void refresh();
}
