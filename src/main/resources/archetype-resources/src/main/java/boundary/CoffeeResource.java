package ${package}.boundary;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author tbs-klg
 */
@Path("coffee")
public class CoffeeResource{

    @Inject
    @ConfigProperty(name = "bean", defaultValue = "arabica")
    String hello;

    @GET
    public String coffee(){
        return hello + " Enjoy your coffee with Jakarta EE and Microprofile 2!";
    }
}
