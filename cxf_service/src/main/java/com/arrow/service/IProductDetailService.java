package com.arrow.service;


import com.arrow.model.ProductDetailServiceModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ayush.shukla on 10/10/2016.
 */

@Path("/productdetail")
public interface IProductDetailService {
    @POST
    @Path("uploadproductdetail")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    String addProductDetail(ProductDetailServiceModel productDeatilServiceModel);
}
