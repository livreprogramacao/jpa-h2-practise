
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
* Video Course — REST as in Hypermedia with Java
* https://blog.sebastian-daschner.com/entries/rest_with_java_video_course
*
* I have recorded a 3-episode video course about RESTful web services (as in Hypermedia / HATEOAS) together with Java.
*
* The motivation was that especially in the Java enterprise field these is quite a bit confusion about the term REST and APIs are sometimes
* too tedious to use. The workshops are meant to be “hands-down” with the real-world usage, not just academic theories.
*
* The first episode will cover different levels of HTTP APIs, what the motivations for REST and Hypermedia are and when to use which
* approach in real-life projects.
*
* The second and third episodes cover the actual implementation with Java and Java EE, on both the server and the client side with
* different maturity levels.
*
* I hope you will enjoy this video course, thanks for watching!
 */
/**
 *
 * @author user
 */
@Path("types")
@Produces(MediaType.APPLICATION_JSON)
public class TypeResource {

    @Inject
    CoffeeShop coffeeShop;

    @GET
    public List<String> getCoffeeTypes() {
        return coffeeShop.getCoffeeTypes();
    }

}
