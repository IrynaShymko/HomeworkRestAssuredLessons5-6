import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.AfterAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;

public class TestBase {
    private static Logger logger = LoggerFactory.getLogger("TestBase.class");
    private static AppProperties appProperties;

    @BeforeAll
    static void BeforeAll() {
        appProperties = new AppProperties();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}