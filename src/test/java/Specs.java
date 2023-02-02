import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class Specs {


    public static RequestSpecification request = with()
            .baseUri("https://demowebshop.tricentis.com")
            .contentType("application/x-www-form-urlencoded; charset=UTF-8")
            .log().all();


    public static ResponseSpecification response200 = new ResponseSpecBuilder()
            .log(LogDetail.ALL)
            .expectStatusCode(200)
            .build();
}
