package com.arrow.service;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by ayush.shukla on 9/27/2016.
 */
@Path("/playerservice")
@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface IProductService {
    @POST
    @Path("getallproduct")
    public SearchQueryResponseModelList getAllProducts();

    @POST
    @Path("getproduct/{serial}")
    public SearchQueryResponseModel getProductBySerialId(@PathParam("serial") int serialId);
}
