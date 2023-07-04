package StepDefinition;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResponses;
import resources.utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class ListingStepDefinition extends utils {


    public RequestSpecification ListingReq;


    @Given("Get the Total {string}{string} with {string}")
    public void get_the_total_with(String size, String page, String resources) throws IOException {


        APIResponses resourceAPI = APIResponses.valueOf(resources);

        RequestSpecification ListingReq = given().spec(requestSpecification())
                .queryParam("size",size)
                .queryParam("page",page);

        Response listResponse = ListingReq.when().get(resourceAPI.getResources()).then().log().all().extract().response();
        String lists = listResponse.asString();
        System.out.println(lists);
        JsonPath js = new JsonPath(lists);
       String Total =  js.getString("total");
       System.out.println("Total Cars are ="+ Total);




    }
}