import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class Specs {
    public static String body = "product_attribute_5_7_1=1" +
            "&addtocart_5.EnteredQuantity=1";

    public static RequestSpecification request = with()
            .baseUri("https://demowebshop.tricentis.com")
            .contentType("application/x-www-form-urlencoded; charset=UTF-8")
            .body(body)
            .log().all();


    public static ResponseSpecification response200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();
}
