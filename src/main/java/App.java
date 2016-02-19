import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/contacts/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Contact contact = Contact.find(Integer.parseInt(request.params(":id")));
      model.put("contact", contact);

      model.put("template", "templates/contacts-addresses-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/contacts", (request, response) ->{
      HashMap<String, Object> model = new HashMap<String, Object>();
      String firstName = request.queryParams("firstName");
      String lastName = request.queryParams("lastName");
      String birthday = request.queryParams("birthday");
      Contact contact = new Contact(firstName, lastName, birthday);
      model.put("contacts", Contact.all());
      model.put("template", "templates/contacts.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/addresses", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String addressType = request.queryParams("addressType");
      String street = request.queryParams("street");
      String city = request.queryParams("city");
      String state = request.queryParams("state");
      int zipCode = Integer.parseInt(request.queryParams("zipCode"));
      Address address = new Address(addressType, street, city, state, zipCode);
      model.put("addresses", Address.all());
      model.put("template", "templates/addresses.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
