package com.arrow.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Service for bootstraping application
 * Created by ayush.shukla on 9/29/2016.
 */

@Path("/bootstrap")
public interface IBootstrap {
    @GET
    @Path("bootstrap")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response appBootstrap();
}
