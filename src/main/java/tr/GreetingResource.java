package tr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        Graph graph = new Graph();

        Vertex A = new Vertex();
        A.setName("A");
        Vertex B = new Vertex();
        A.setName("B");
        Vertex C = new Vertex();
        A.setName("C");
        Vertex D = new Vertex();
        A.setName("D");

        Edge a = new Edge();
        a.setName("a");
        a.setSource(A);
        a.setTarget(B);
        Edge b = new Edge();
        b.setName("b");
        a.setSource(B);
        a.setTarget(D);
        Edge c = new Edge();
        c.setName("d");
        a.setSource(C);
        a.setSource(D);
        Edge d = new Edge();
        d.setName("c");
        a.setSource(A);
        a.setTarget(C);

        return A.getName();
    }
}