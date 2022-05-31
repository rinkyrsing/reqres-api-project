package in.reqres.testbase.usersinfo;

import in.reqres.testbase.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class VerificationTest extends TestBase {

    static ValidatableResponse response;

    @BeforeClass
    public static void init(){
       response= given()
       .when()
          .get("/users?page=2")
          .then().statusCode(200);


    }

    @Test
    public void test01() {
        //Verify page = 2

        int page = response.extract().path("page");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of page is : " + page);
        System.out.println("------------------End of Test---------------------------");
    }
@Test
public void test02() {
    int perpage = response.extract().path("per_page");

    System.out.println("------------------StartingTest---------------------------");
    System.out.println("The value of per-page is : " + perpage);
    System.out.println("------------------End of Test---------------------------");
}

    @Test
    public void test03() {
        int dataId = response.extract().path("data[1].id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of data[1] id is : " +dataId);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void test04() {
        String  name = response.extract().path("data[3].first_name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of data[3] first name : " + name);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void test05() {
        List<Integer> listOfData = response.extract().path("data.id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of list of data : " + listOfData);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void test06() {
        String link = response.extract().path("data[5].avatar");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of link : " + link);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void test07() {
        String url = response.extract().path("support.url");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of url : " + url);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void test08() {
        String text = response.extract().path("support.text");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of get text : " + text);
        System.out.println("------------------End of Test---------------------------");
    }




}