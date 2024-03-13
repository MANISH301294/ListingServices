package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


import static io.restassured.RestAssured.given;


public class Listingutils {

   public static RequestSpecification Listreq;
   public static RequestSpecification ListingReq;
   public static RequestSpecification VehicleReq;
    public  RequestSpecification requestSpecification() throws IOException {

        PrintStream log = new PrintStream(Files.newOutputStream(Paths.get("logger.txt")));

        Listreq =  new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
            .addFilter(RequestLoggingFilter.logRequestTo(log))
            .addFilter(ResponseLoggingFilter.logResponseTo(log))
            .addHeader("x_country","AU")
            .addHeader("x_vehicle_type","CAR")
            .addHeader("authority","listing-service-au.c24.tech")
            .addHeader("accept","application/json, text/plain, */*")
            .addHeader("accept-language","en-GB,en-US;q=0.9,en;q=0.8")
            .addHeader("Connection","keep-alive").build();
    return Listreq;
    }

    public RequestSpecification listingReq(String size, String page) throws IOException
    {
         ListingReq =   given().spec(requestSpecification())
                .queryParam("size",size)
                .queryParam("page",page);
         return ListingReq;
    }

    public RequestSpecification vehicleReq(String id) throws IOException
    {
        VehicleReq = given().spec(requestSpecification())
                .pathParam("appPath",id);
        return VehicleReq;
    }


    public static   String  getGlobalValue(String Key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/user/Downloads/ListingService 2/src/test/java/resources/global.properties");
        prop.load(fis);
        return prop.getProperty(Key);
    }

    }


