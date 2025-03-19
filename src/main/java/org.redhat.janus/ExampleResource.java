package org.redhat.janus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customers")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String customer() {
        System.out.println("customers called");
        return "customer retrieved";
    }

}
