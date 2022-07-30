package ru.netology.postmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Post {
    @Test
    public void postTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("dsa")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schema.json"))
        ;
    }

    @Test
    public void postTest2() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("qwe")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schema.json"))
        ;
    }
    @Test
    public void postTest3() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("asd")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schema.json"))
        ;
    }
}
