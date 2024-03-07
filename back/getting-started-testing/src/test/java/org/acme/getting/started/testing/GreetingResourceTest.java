package org.acme.getting.started.testing;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(GreetingResource.class)
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        when().get()
            .then()
            .statusCode(200)
            .body(is("hello"));
    }
}