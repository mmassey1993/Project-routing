package org.bob.cxfrs.beans;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class EmployeeServiceResource {

    @Context
    private UriInfo uriInfo;

    public EmployeeServiceResource() {
    }

    @POST
    @Path("/employees/shtuff")
    @Consumes(MediaType.APPLICATION_JSON)
    public String getCustomer(String shtuff) {
        return null;
    }
}
