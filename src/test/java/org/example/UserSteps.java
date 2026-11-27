package org.example;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class UserSteps {

    private Response response;

    @Given("que consumo el servicio de usuarios")
    public void consumirServicio() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @When("realizo una peticion GET")
    public void realizarPeticion() {
        response = given().when().get("/users");
    }

    @Then("el codigo de respuesta debe ser {int}")
    public void validarCodigo(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @And("la lista de usuarios no debe estar vacia")
    public void validarLista() {
        assertTrue(response.jsonPath().getList("$").size() > 0);
    }
}