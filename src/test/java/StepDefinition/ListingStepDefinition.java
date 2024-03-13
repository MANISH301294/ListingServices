package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.junit.Assert;
import pojo.listing.ListingPage;
import pojo.Vehicle.VehicleDetailResult;
import resources.APIResponses;
import resources.VehicleAPIResponses;
import utils.ListingUtils;


import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


public class ListingStepDefinition extends ListingUtils {

    int Total;
    int TotalPages;
    int CarCount;
    public RequestSpecification ListingReq;
    ListingPage carlist;
    int totalCars = 0;

    double MinWeight = 975;
    double mediumWeight = 1154;
    double highWeight = 1504;
    double superWeight = 2504;


    String Engineconfiguration = "Diesel Twin Turbo";

    String Enginconfigure = "Diesel Twin Turbo 4";

    String EngCylinder = "3";
    int CylinderCount = 1;
    int EngineConfigss =1;

    VehicleDetailResult VehicleDetails;


    private List<String> appointmentIds = new ArrayList<>();


    @Given("Get the ListingAPI {string}{string} with {string}")
    public void get_the_listing_api_with(String size, String page, String resources) throws IOException {

        APIResponses resourceAPI = APIResponses.valueOf(resources);
        carlist = listingReq(size, page).when().get(resourceAPI.getResources()).as(ListingPage.class);

    }

    @Then("Get the total number of cars")
    public void get_the_total_number_of_cars() {
        Total = Integer.parseInt(carlist.getTotal());
        System.out.println("Total = " + Total);

    }

    @Then("Calculate How many cars in first page")
    public void calculate_how_many_cars_in_first_page() {
        CarCount = carlist.results.size();
        TotalPages = Total / CarCount;
    }

    @Then("Calculate total number of Cars with {string}")
    public void calculate_total_number_of_cars_with(String resources) throws IOException {

        APIResponses resourceAPI = APIResponses.valueOf(resources);
        for (int i = 0; i <= TotalPages; i++) {
            ListingPage carlist1 = listingReq(Integer.toString(20), Integer.toString(i))
                    .when().get(resourceAPI.getResources()).as(ListingPage.class);
            int CarCounts = carlist1.results.size();
            totalCars = totalCars + CarCounts;
            System.out.println(totalCars);
        }
    }

    @Then("Assert the number of cars with total")
    public void assert_the_number_of_cars_with_total() {
        Assert.assertEquals(Total, totalCars);
    }

    @Then("Calculate number of pages required")
    public void calculate_number_of_pages_required() {
        System.out.println("Total Pages = " + TotalPages);
    }


    @Then("Find the car with this {string} with {string}")
    public void find_the_car_with_this_with(String Appointment_Id, String resources) throws IOException {
        APIResponses resourceAPI = APIResponses.valueOf(resources);
        for (int i = 0; i <= TotalPages; i++) {
            carlist = listingReq(Integer.toString(20), Integer.toString(i))
                    .when().get(resourceAPI.getResources()).as(ListingPage.class);
            int cars = carlist.results.size();
            for (int c = 0; c < cars; c++) {
                String appointmentCars = carlist.results.get(c).getAppointmentId();
                //   System.out.println(appointmentCars);
                appointmentIds.add(appointmentCars);
                if (Appointment_Id.equals(appointmentCars)) {
                    System.out.println("Appointment Id = " + appointmentCars);
                    System.out.println("EGC = " + carlist.results.get(c).getEgc());
                    System.out.println("Odometer = " + carlist.results.get(c).getOdometerReading());
                    System.out.println("Status code = " + carlist.results.get(c).getStateCode());
                    System.out.println("Emi Details = " + carlist.results.get(c).getEmiDetails().getEmi());
                    break;
                }
            }
        }
    }

    @And("Number of cars saved in arraylist with {string}")
    public void numberOfCarsSavedInArraylistWith(String resources) throws IOException {
        VehicleAPIResponses resourcesAPI = VehicleAPIResponses.valueOf(resources);

        for (String id : appointmentIds) {


            VehicleDetails = vehicleReq().when().get(resourcesAPI.getResources(id)).as(VehicleDetailResult.class);

//            double egc = VehicleDetails.getDetail().getEgc();
//            System.out.println(egc);
//
//            String Cylinder = VehicleDetails.getDetail().getSpecifications().get(3).getChild().get(4).getValue();
//            System.out.println("Appointment Ids = " + id);
//            System.out.println("No. of cylinder = " + Cylinder);
//            if (EngCylinder.equals(Cylinder)) {
//                System.out.println("Appointment Ids = " + id);
//                System.out.println("No. of cylinder = " + Cylinder);
//            }

            double KerbWeight = VehicleDetails.getDetail().getKerbWeight();
            String state = VehicleDetails.getDetail().getStateCode();


            if (KerbWeight <= MinWeight) {
                System.out.println("min Appointment = " + id);
            } else if (KerbWeight <= mediumWeight) {
                System.out.println("Medium = " + id);
            } else if (KerbWeight <= highWeight) {
                System.out.println("Higher = " + id);
            } else if (KerbWeight <= superWeight) {
                System.out.println("Super = " + id);
            }
        }}


      @And("No of cylinder in system")
       public void No_of_cylinder_in_system () {
                      for (String id : appointmentIds) {
                RestAssured.baseURI = "https://listing-service-au.c24.tech";
                Response response = RestAssured.given()
                        .pathParam("appPath", id)
                        .header("authority", "listing-service-au.c24.tech")
                        .header("accept", "application/json, text/plain, */*")
                        .header("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
                        .header("origin", "https://www.cars24.com")
                        .header("referer", "https://www.cars24.com/")
                        .header("x_country", "AU")
                        .header("x_vehicle_type", "CAR")
                        .when().get("/v1/vehicle/{appPath}");

                String cylinder = response.jsonPath().get("detail.specifications.find{it.key == 'engine'}.child.find{it.key=='Cylinders'}.value");

                if (EngCylinder.equals(cylinder)) {
                    System.out.println("Appointment Ids = " + id);
                    System.out.println("No. of cylinder = " + cylinder);
                    System.out.println("Total no. of cars with 3 cylinder = " + CylinderCount++);
                }}
        }

    @And("Engine configuration of car")
    public void engine_configuration_of_car() {
        for(String id:appointmentIds)
        {
            RestAssured.baseURI = "https://listing-service-au.c24.tech";
            Response response = RestAssured.given()
                    .pathParam("appPath", id)
                    .header("authority", "listing-service-au.c24.tech")
                    .header("accept", "application/json, text/plain, */*")
                    .header("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
                    .header("origin", "https://www.cars24.com")
                    .header("referer", "https://www.cars24.com/")
                    .header("x_country", "AU")
                    .header("x_vehicle_type", "CAR")
                    .when().get("/v1/vehicle/{appPath}");


            Object engineConfig = response.jsonPath().get("detail.specifications.find{it.key == 'engine'}.child.find{it.key=='engineConfiguration'}.value");


            if (Engineconfiguration.equals(engineConfig)) {
                System.out.println("Appointment Ids = " + id);
                System.out.println("Engine = " + engineConfig);
                System.out.println("Total no. of cars with EngineConfig = " + EngineConfigss++);
            }
            else if (Enginconfigure.equals(engineConfig))
            {
                System.out.println("Appointment Ids = " + id);
                System.out.println("Engine = " + engineConfig);
                System.out.println("Total no. of cars with EngineConfig = " + EngineConfigss++);
            }
        }
    }}



