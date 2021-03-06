package daggerok;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/hello")
public class AdminResource {

    @GET
    @Path("/admin")
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject me() {
        return Json.createObjectBuilder()
                   .add("hello", "Admin")
                   .build();
    }
}
