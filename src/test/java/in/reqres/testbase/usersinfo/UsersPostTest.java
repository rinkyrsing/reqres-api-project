package in.reqres.testbase.usersinfo;

import in.reqres.model.StudentPojo;
import in.reqres.testbase.testbase.TestBase;
import io.restassured.response.Response;
import org.json.JSONException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class UsersPostTest extends TestBase {

    @Test
    public void CreateUsers(){

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("John");
        studentPojo.setJob("Automation Tester");


        Response response = given()
                .header("Content-Type","application/json; charset=utf-8")
                .body(studentPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();
    }
@Test
    public void loginSuccessfully() {


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmail("eve.holt@reqres.in");
        studentPojo.setPassword("cityslicka");

        Response response = given()
            .header("Authorization", "Bearer abc123")
            .header("Content-Type","application/json; charset=utf-8")
            .body(studentPojo)
            .when()
            .post("/login");
    response.then().statusCode(200);
    response.prettyPrint();

}
}
