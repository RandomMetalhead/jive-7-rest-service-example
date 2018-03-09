/*
 * Copyright(C) 2016 RandomMetalhead
 *
 * This software is the proprietary information of Jive Software. Use is subject to license terms.
 */

package com.jivesoftware.randommetalhead.rest;

import javax.ws.rs.*;

@Produces("application/json")
@Path("/")
public interface ExampleRestService {

    @GET
    @Path("/")
    public String getTeststring(@QueryParam("testString") String testString);

    @POST
    @Path("/")
    public String postTeststring(@QueryParam("testString") String testString);

    @DELETE
    @Path("/")
    public String deleteTeststring(@QueryParam("testString") String testString);
}
