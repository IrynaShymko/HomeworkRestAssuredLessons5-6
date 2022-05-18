import Helpers.RequestSpecificationHelper;
import Helpers.ResponseSpecificationHelper;
import Helpers.WeatherParametersHelper;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class WeatherTest extends TestBase{

    @Test
    public void shouldGetWeather(){
        given(RequestSpecificationHelper.getRequestSpecificationForGetWeather()).
        when()
                .get().
        then().spec(ResponseSpecificationHelper.getDefaultResponseSpecification(200));
    }

    @Test
    public void shouldCheckCityName(){
        given(RequestSpecificationHelper.getRequestSpecificationForGetWeather()).
                when()
                .get().
                then()
                .spec(ResponseSpecificationHelper.getDefaultResponseSpecification(200))
                .body(WeatherParametersHelper.NAME, is(System.getProperty("cityName")));
    }

    @Test
    public void shouldCheckClouds(){
        given(RequestSpecificationHelper.getRequestSpecificationForGetWeather()).
                when()
                .get().
                then()
                .spec(ResponseSpecificationHelper.getDefaultResponseSpecification(200))
                .body(WeatherParametersHelper.CLOUDS_ALL, is(Integer.parseInt(System.getProperty("cloudsLevel"))));
    }
}
