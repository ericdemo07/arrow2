package com.arrow.internal.currencyratemanager;

import com.arrow.internal.JedisManager;
import com.arrow.internal.currencyratemanager.model.CurrencyModel;
import redis.clients.jedis.Jedis;

/**
 * Created by ayush.shukla on 10/3/2016.
 */
public class CurrencyObserver extends Observer {
    private static Jedis jedis;

    public CurrencyObserver(CurrencyModel currencyModel) {
        this.currencyModel = currencyModel;
        this.currencyModel.attach(this);
    }

    @Override
    public void refresh() {
        jedis = JedisManager.getinstance();
        jedis.hmset("Currency:" + "Currency", currencyModel.getRate());
    }
}
