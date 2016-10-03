package com.arrow.internal.currencyratemanager;

import com.arrow.internal.currencyratemanager.model.CurrencyLayerResponse;
import com.arrow.internal.currencyratemanager.model.CurrencyModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Courtsey : @see <a href="https://currencylayer.com/">CurrencyLayer</a>
 * Created by ayush.shukla on 10/3/2016.
 */
public class RefreshCurrency {
    public static void refresh() {
        RestTemplate restTemplate = new RestTemplate();
        String currencyLayerUrl = "http://www.apilayer.net/api/live?access_key=69663146c1797e1d64ff09de94f0bca0";
        ResponseEntity responseEntity = restTemplate.getForEntity(currencyLayerUrl, CurrencyLayerResponse.class);
        CurrencyLayerResponse currencyLayerResponse = (CurrencyLayerResponse) responseEntity.getBody();
        CurrencyModel currencyModel = new CurrencyModel();
        new CurrencyObserver(currencyModel);
        currencyModel.setRate(currencyLayerResponse.getQuotes());
    }
}
