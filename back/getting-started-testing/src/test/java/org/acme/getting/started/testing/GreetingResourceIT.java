package org.acme.getting.started.testing;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusIntegrationTest
public class GreetingResourceIT extends GreetingResourceTest {

    // Execute the same tests but in native mode.


    @QuarkusTest
    public static class StaticContentTest {

        @TestHTTPResource("index.html")
        URL url;

        @Test
        public void testIndexHtml() throws IOException {
            try (InputStream in = url.openStream()) {
                String contents = new String(in.readAllBytes(), StandardCharsets.UTF_8);
                Assertions.assertTrue(contents.contains("<title>Testing Guide</title>"));
            }
        }
    }
}