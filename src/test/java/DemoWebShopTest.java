import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class DemoWebShopTest {
    public String body = "product_attribute_5_7_1=1" +
            "&addtocart_5.EnteredQuantity=1";

    @Test
    public void addProductToCart() {
        given()
                .spec(Specs.request)
                .body(body)
                .when()
                .post("/addproducttocart/details/5/1")
                .then()
                .spec(Specs.response200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                .body("updatetopcartsectionhtml", is("(1)"));
    }
}
