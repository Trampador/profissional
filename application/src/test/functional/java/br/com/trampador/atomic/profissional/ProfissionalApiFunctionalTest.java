package br.com.trampador.atomic.profissional;

import io.restassured.RestAssured;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.Matchers.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProfissionalApiFunctionalTest {

    @BeforeAll
    public void init() {
        String baseURI = System.getenv("BASE_URI");
        String port = System.getenv("PORT");

        RestAssured.baseURI = baseURI == null ? RestAssured.DEFAULT_URI : baseURI;
        RestAssured.port = port == null ? 8080 : Integer.parseInt(port);
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Test
    public void testGetProfissional() {
    }
}
