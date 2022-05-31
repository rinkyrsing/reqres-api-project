package in.reqres.testbase.usersinfo;

import in.reqres.testbase.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UsersDeleteTest extends TestBase {

    @Test
    public void deleteUsers() {

        Response response = given()
                .when()
                .delete("/users/2");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
