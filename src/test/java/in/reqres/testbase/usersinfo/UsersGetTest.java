package in.reqres.testbase.usersinfo;

import in.reqres.testbase.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class UsersGetTest extends TestBase {


@Test
    public void getAllStudentsInfo(){

    Response response = given()
            .when()
            .get("users.all");
    response.then().statusCode(200);
    response.prettyPrint();

}
@Test
public void getSingleUser(){
    Response response = given()
            .when()
            .get("/users/2");
             
    response.then().statusCode(200);
    response.prettyPrint();
}

}
