package rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestService {

    public static Response response;

    public void simpleGetRequest(String url){
        RestAssured.baseURI = url;
        RequestSpecification request = RestAssured.given();
        response = request.get();
    }

}
