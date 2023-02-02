import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class DemoWebShopTest {

    @Test
    public void addProductToCart() {
        given()
                .spec(Specs.request)
                .when()
                .post("/addproducttocart/details/5/1")
                .then()
                .spec(Specs.response200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                .body("updatetopcartsectionhtml", is("(1)"));
    }
}
