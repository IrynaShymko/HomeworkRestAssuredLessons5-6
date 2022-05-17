import Helpers.RequestSpecificationHelper;
import Helpers.ResponseSpecificationHelper;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class WeatherTest extends TestBase{

    @Test
    public void shouldGetWeather(){
        given(RequestSpecificationHelper.getRequestSpecificationForGetWeather()).
        when()
                .get().
        then().spec(ResponseSpecificationHelper.getDefaultResponseSpecification(200));
    }
}
