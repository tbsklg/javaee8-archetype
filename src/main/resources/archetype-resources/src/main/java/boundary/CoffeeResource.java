package com.tbs-klg.boundary;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author tbs-klg
 */
@Path("coffee")
public class CoffeeResource{

    @GET
    public String coffee(){
        return "Enjoy your coffee with Jakarta EE and Microprofile 2!";
    }
}

