package Helpers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationHelper {
    public static ResponseSpecification getDefaultResponseSpecification(int statusCode){
        ResponseSpecification responseSpecification = RestAssured.expect();
        responseSpecification.statusCode(statusCode);
        responseSpecification.contentType(ContentType.JSON);
        return responseSpecification;
    }
}
