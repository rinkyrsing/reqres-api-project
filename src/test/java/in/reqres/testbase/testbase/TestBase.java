package in.reqres.testbase.testbase;

import in.reqres.utils.TestUtils;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase extends TestUtils {

    @BeforeClass
    public static void inIt() {
        //This is environment
        RestAssured.baseURI = "https://reqres.in";
      //  RestAssured.port = 8080;
        RestAssured.basePath = "/api";
    }


}
