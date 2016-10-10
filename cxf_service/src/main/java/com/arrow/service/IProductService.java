package com.arrow.service;


import com.arrow.model.SearchQueryResponseModel;
import com.arrow.model.SearchQueryResponseModelList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by ayush.shukla on 9/27/2016.
 */
@Path("/productservice")
public interface IProductService {
    @GET
    @Path("getallproduct")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    SearchQueryResponseModelList getAllProducts();

    @GET
    @Path("getproduct/{serial}")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    SearchQueryResponseModel getProductBySerialId(@PathParam("serial") String serialId);
}
