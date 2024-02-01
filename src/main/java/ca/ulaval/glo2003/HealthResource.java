package ca.ulaval.glo2003;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.grizzly.http.HttpContext;
import org.glassfish.grizzly.http.HttpHeader;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.uri.UriComponent;

import javax.print.attribute.standard.Media;
import java.net.http.HttpClient;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;


/* TESTTT */
@Path("")
public class HealthResource {

    //Get header info: @HeaderParam("id") String _str in args, where "id" is the key of
    // the header value needed and _str holds wanted value

    @GET
    @Path("health")
    @Produces(MediaType.APPLICATION_JSON)
    public Response health() {
        String test = """
                {
                    title: "hi",
                    available: false
                }
                """;
        String body = """      
        {
            error: "INVALID_PARAMETER",
            description: " """ + "reason" + """ 
        "
        }
        """;
        System.out.println(body);
        return Response.ok().entity(test).build();
        /* return Response.ok(new HealthResponse("ok")).build(); */
    }

    @GET
    @Path("products")
    public String products(){
        System.out.println("yellow");
        return "yellow2";
    }

    @POST
    @Path("products")
    @Consumes(MediaType.APPLICATION_JSON)
    public String productsPOST(Product product){
        String name = product.getTitle();
        if(name == null){
            System.out.println("allo");
        }

        return "New product titled: " + product.getTitle() + ", description: " + product.getDescription() + ", price: " + product.getPrice();
        /* return "New product " + product.getTitle();*/
        /*String[] list = stringParser(product);
        return product;*/
    }

    private String[] stringParser(String string){
        String[] list = string.split(" ");
        List<String> sansVide = new ArrayList<String>();
        List<String> sansDemarquateur = new ArrayList<String>();
        List<String> sansGuillemet = new ArrayList<String>();
        List<String> sansVirguleNiBraquetNiAccolade = new ArrayList<String>();

        for(String obj: list){
            if(!obj.isEmpty()){
                sansVide.add(obj);
            }
        }

        for(String obj: sansVide){
            if(obj.contains("\n") || obj.contains("\r")){
                int indexR = obj.indexOf("\r");
                int indexN = obj.indexOf("\n");
                if(indexN < indexR){
                    sansDemarquateur.add(obj.substring(0, indexN));
                }
                else{
                    sansDemarquateur.add(obj.substring(0, indexR));
                }
            }
            else{
                sansDemarquateur.add(obj);
            }
        }

        for(String obj: sansDemarquateur){
            if(obj.contains("\"")){
                int lastIndex = obj.length() - 1;
                sansGuillemet.add(obj.substring(1, lastIndex - 1));
            }
            else{
                sansGuillemet.add(obj);
            }
        }

        for(String obj: sansGuillemet){
            if(obj.contains(",")){
                int index = obj.indexOf(",");
                sansVirguleNiBraquetNiAccolade.add(obj.substring(0,index));
            }
            else if(!obj.equals("[") && !obj.equals("]") && !obj.equals("{") && !obj.equals("}")){
                sansVirguleNiBraquetNiAccolade.add(obj);
            }
        }

        return list;
    }

    @POST
    @Path("products/{title}")
    public String makeProduct(@PathParam("title") String title){

        return "New product has been created; " + title;
    }

    @Path("products/{id}")
    @GET
    public Response getProduct(@PathParam("id") String id){
        System.out.println("Blu blu blu blu");
         /* return Response.status(404).build(); */
        /* Product product1 = new Product("apple", "red, round", 2.00, false);
        Product product2 = new Product("orange", "orange, round", 3.25, false);
        List<Product> list = new ArrayList<Product>();
        list.add(product1);
        list.add(product2);
        List<List<Product>> list2 = new ArrayList<List<Product>>();
        list2.add(list);
        list2.add(list); */

lab1 lab = new lab1(new Date(2010, 1, 3), 12);

        return Response.ok().header("Content-Type", "application/json").header("URL", "www.google.com").entity(lab).build();
    }

}
