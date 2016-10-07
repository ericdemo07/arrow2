package com.arrow.service.impl;

import com.arrow.controller.BootstrapController;
import com.arrow.model.BootstrapModel;
import com.arrow.service.IBootstrap;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

/**
 * Created by ayush.shukla on 9/29/2016.
 */

@Service("bootstrap")
public class BootstrapImpl implements IBootstrap {
    public Response appBootstrap() {
        BootstrapModel bootstrapModel = new BootstrapModel();
        bootstrapModel.setStatus("success");
        BootstrapController.bootstrap();
        return Response.status(200).entity(bootstrapModel).build();
    }
}
