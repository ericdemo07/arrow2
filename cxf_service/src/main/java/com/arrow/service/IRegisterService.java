package com.arrow.service;

import com.arrow.model.RegisterRequestServiceModel1;
import com.arrow.model.RegisterRequestServiceModel2;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by ayush.shukla on 10/17/2016.
 */

@Path("/registerservice")
public interface IRegisterService {
    @POST
    @Path("registerservice1")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String registerService1(RegisterRequestServiceModel1 resisterRequestServiceModel1);

    @GET
    @Path("registerotpservice/{otp}")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String registerOtpService(@PathParam("otp") String otp);

    @GET
    @Path("registershopperidservice/{shopperId}")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String registerShopperIdService(@PathParam("shopperId") String shopperId);

    @POST
    @Path("registerservice2")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String registerService2(RegisterRequestServiceModel2 resisterRequestServiceModel2);
}
