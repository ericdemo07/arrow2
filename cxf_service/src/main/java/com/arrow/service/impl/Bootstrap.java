package com.arrow.service.impl;

import com.arrow.controller.SearchQueryController;
import com.arrow.model.BootstrapModel;
import com.arrow.service.IBootstrap;
import org.springframework.stereotype.Service;

/**
 * Created by ayush.shukla on 9/29/2016.
 */

@Service("bootstrap")
public class Bootstrap implements IBootstrap {
    public BootstrapModel appBootstrap() {
        BootstrapModel bootstrapModel = new BootstrapModel();
        bootstrapModel.setStatus("success");
        SearchQueryController.bootstrap();
        return bootstrapModel;
    }
}
