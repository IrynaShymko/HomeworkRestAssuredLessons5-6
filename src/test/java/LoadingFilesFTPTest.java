import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class LoadingFilesFTPTest {
    File file = new File("src/main/resources/test_SZ.csv");
    String endpoint = "https://the-internet.herokuapp.com/upload";

    @Test
    public void tryLoad() {
        Response response = given()
                .multiPart("file", file, "text/html")
                .when().post(endpoint)
                .thenReturn();
        System.out.println("<<<<<<<<<RESPONSE \n" + response.prettyPrint());
        assert (response.statusCode() == 200);

    }
}
