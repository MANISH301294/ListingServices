package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.sessionId;
import static utils.ListingUtils.getGlobalValue;


public class VehicleUtils {
     public static RequestSpecification VehicleReq;
    public static RequestSpecification VehiclesReq;
    public RequestSpecification vehilerequestspecification () throws IOException {
        PrintStream log = new PrintStream(Files.newOutputStream(Paths.get("vehiclelogger.txt")));

     VehiclesReq =new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
                 .addFilter(RequestLoggingFilter.logRequestTo(log))
                 .addFilter(ResponseLoggingFilter.logResponseTo(log))
                 .addHeader("authority", "listing-service-au.c24.tech")
                 .addHeader("accept", "application/json, text/plain, */*")
                 .addHeader("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
                 .addHeader("origin", "https://www.cars24.com")
                 .addHeader("referer", "https://www.cars24.com/")
                 .addHeader("x_country", "AU")
                 .addHeader("x_vehicle_type", "CAR").build();
     return  VehiclesReq;
    }


    public RequestSpecification vehicleReq() throws IOException {
    VehicleReq =     given().spec(vehilerequestspecification());

    return VehicleReq;

    }




}
