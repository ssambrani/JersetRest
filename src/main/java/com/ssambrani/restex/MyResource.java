package com.ssambrani.restex;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 */
@Path("ACAPS")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{acapsId}")
    public String inquireAcaps(@PathParam("acapsId") String acapsId) {
    	
    	System.out.println("Acaps id passed " + acapsId);
        return "ACAPS ID " + acapsId;
    }   
}
