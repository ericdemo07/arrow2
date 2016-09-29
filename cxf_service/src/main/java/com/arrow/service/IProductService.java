package com.arrow.service;


import com.arrow.model.ProductResponseModel;
import com.arrow.model.SearchQueryResponseModelList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by ayush.shukla on 9/27/2016.
 */
@Path("/productservice")
@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface IProductService {
    @POST
    @Path("getallproduct")
    public SearchQueryResponseModelList getAllProducts();

    @POST
    @Path("getproduct/{serial}")
    public ProductResponseModel getProductBySerialId(@PathParam("serial") int serialId);
}
