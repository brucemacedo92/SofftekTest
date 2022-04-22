package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SofttekAPITest {

    @Test
    public void test1(){

        Response response = RestAssured.get("https://swapi.dev/api/people/1/");

        System.out.println("Response: "+response.asString());
        System.out.println("Status Code: "+response.getStatusCode());
        System.out.println("Body: "+response.getBody().asString());
        System.out.println("Time Taken: "+response.getTime());
        System.out.println("Header: "+response.getHeader("Content-Type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void test2(){

        Response response = RestAssured.get("https://swapi.dev/api/planets/7/");

        System.out.println("Response: "+response.asString());
        System.out.println("Status Code: "+response.getStatusCode());
        System.out.println("Body: "+response.getBody().asString());
        System.out.println("Time Taken: "+response.getTime());
        System.out.println("Header: "+response.getHeader("Content-Type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void test3(){

        Response response = RestAssured.get("https://swapi.dev/api/starships/1/");

        System.out.println("Response: "+response.asString());
        System.out.println("Status Code: "+response.getStatusCode());
        System.out.println("Body: "+response.getBody().asString());
        System.out.println("Time Taken: "+response.getTime());
        System.out.println("Header: "+response.getHeader("Content-Type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
}
