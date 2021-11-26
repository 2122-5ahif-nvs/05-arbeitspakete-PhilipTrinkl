package at.htl;

import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class GreetingService {

    @ConsumeEvent
    public String consume(String name) {
        return name.toUpperCase();
    }
}