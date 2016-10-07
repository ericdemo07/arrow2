package com.arrow.service;

import com.arrow.model.LoginRequestServiceModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ayush.shukla on 10/6/2016.
 */

@Path("/loginservice")
public interface ILoginService {
    @POST
    @Path("loginservice")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String loginService(LoginRequestServiceModel loginRequestServiceModel);
}
