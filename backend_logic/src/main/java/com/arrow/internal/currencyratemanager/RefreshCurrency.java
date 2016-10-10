package com.arrow.internal.currencyratemanager;

import com.arrow.InternalArrowException;
import com.arrow.internal.PreferenceManger;
import com.arrow.internal.currencyratemanager.model.CurrencyLayerResponse;
import com.arrow.internal.currencyratemanager.model.CurrencyModel;
import com.arrow.util.YamlLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Here we get currency rate for diffrent economies
 * designed using Observer Pattern for ({@link CurrencyObserver})
 * Courtsey : @see <a href="https://currencylayer.com/">CurrencyLayer</a>
 * Created by ayush.shukla on 10/3/2016.
 */
public class RefreshCurrency {
    public static void refresh() throws InternalArrowException {
        YamlLoader.loadYaml();
        RestTemplate restTemplate = new RestTemplate();
        StringBuilder currencyLayerUrl = new StringBuilder();
        currencyLayerUrl.append(PreferenceManger.getPreferences().get("currencyLayer.url", "noval"));
        currencyLayerUrl.append("?access_key=");
        currencyLayerUrl.append(PreferenceManger.getPreferences().get("currencyLayer.key", "noval"));

        ResponseEntity responseEntity = restTemplate.getForEntity(currencyLayerUrl.toString(), CurrencyLayerResponse.class);
        CurrencyLayerResponse currencyLayerResponse = (CurrencyLayerResponse) responseEntity.getBody();
        CurrencyModel currencyModel = new CurrencyModel();
        new CurrencyObserver(currencyModel);
        currencyModel.setRate(currencyLayerResponse.getQuotes());
    }
}
