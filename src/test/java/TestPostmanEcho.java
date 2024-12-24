import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestPostmanEcho {

    @Test
    public void whenGetRequest_thenEqual() {

        RestAssured.baseURI = "https://postman-echo.com";
        given().log().all()
                .when().get("/get?foo1=bar1&foo2=bar2")
                .then().log().body().statusCode(200)
                .assertThat()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token",not(""))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void whenPostRaw_thenEqual() {
        RestAssured.baseURI = "https://postman-echo.com";
        String responseBody = "{\"test\": \"value\"}";
        given().log().all().body(responseBody)
                .when().post("/post")
                .then().log().body().statusCode(200)
                .assertThat()
                .body("data", equalTo("{\"test\": \"value\"}"))
                .body("args",notNullValue())
                .body("files",notNullValue())
                .body("form",notNullValue())
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("17"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.postman-token",not(""))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));

    }

    @Test
    public void whenPostForm_thenEqual() {
        RestAssured.baseURI = "https://postman-echo.com";
        given().log().all().contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when().post("/post")
                .then().log().body().statusCode(200)
                .assertThat()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("args", notNullValue())
                .body("files", notNullValue())
                .body("data", equalTo(""))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("19"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.content-type", equalTo("application/x-www-form-urlencoded; charset=utf-8"))
                .body("headers.postman-token",not(""))
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void whenPutRequest_thenEqual() {
        RestAssured.baseURI = "https://postman-echo.com";
        String responseBody = "This is expected to be sent back as part of response body.";
        given().log().all().body(responseBody)
                .when().put("/put")
                .then().log().body().statusCode(200)
                .assertThat()
                .body("args", notNullValue())
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.postman-token",not(""))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    public void whenPatchRequest_thenEqual() {
        RestAssured.baseURI = "https://postman-echo.com";
        String responseBody = "This is expected to be sent back as part of response body.";
        given().log().all().body(responseBody)
                .when().patch("/patch")
                .then().log().body().statusCode(200)
                .assertThat()
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("args", notNullValue())
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.postman-token",not(""))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void whenDeleteRequest_thenEqual() {
        RestAssured.baseURI = "https://postman-echo.com";
        String responseBody = "This is expected to be sent back as part of response body.";
        given().log().all().body(responseBody)
                .when().delete("/delete")
                .then().log().body().statusCode(200)
                .assertThat()
                .body("args", notNullValue())
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.postman-token",not(""))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}

