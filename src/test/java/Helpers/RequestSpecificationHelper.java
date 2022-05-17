package Helpers;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationHelper {

    public static RequestSpecification getRequestSpecificationForGetWeather(){
        RequestSpecification requestSpecification = RestAssured.given()
                .baseUri(System.getProperty("baseUriGetWeather"))
                .param(System.getProperty("countryParameterName"), System.getProperty("countryName"))
                .param(System.getProperty("appIdParameterName"), System.getProperty("appId"));
        return requestSpecification;
    }
}
