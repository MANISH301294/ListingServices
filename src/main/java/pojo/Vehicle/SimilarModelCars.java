package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimilarModelCars {
    private String appointmentId;
    private String year;
    private String modelYear;
    private double egc;
    private double estimatedPrice;
    private double tradeInAmount;
    private Boolean personalised;
    private EmiDetail emiDetails;
    private String expressDelivery;
    private String cityCode;
    private String stateCode;
    private String state;
    private String make;
    private String model;
    private String variant;
    private String trim;
    private String specs;
    private String engineSize;
    private String driveType;
    private String noOfCylinders;
    private boolean turbochargerSuperchargerAvailable;
    private boolean booked;
    private boolean listingActive;
    private String  city;
    private String  vin;
    private int  kbbAskingPrice;
    private int  kbbAskingPriceRangeMin;
    private int  kbbAskingPriceRangeMax;
    private String  kbbValueProvidedOn;
    private String threeSixtyViewUrl;
    private boolean threeSixtyViewAvailable;
    private String mediaSource;
    private double kerbWeight;
    private MainImage mainImage;
    private double  gst;
    private String body;
    private boolean comingSoon;
    private boolean reserved;
    private boolean dapPriceEnabled;
    private String offer;
    private String exteriorImages;
    private String interiorImages;
    private String imperfectionImages;
    private String vehicleFeatures;
    private String vehicleSpecifications;
    private double dapPrice;
    private String inspectionObject;
    private double price;
    private int odometerReading;
    private String ownerNumber;
    private String transmissionType;
    private String fuelType;
    private String seats;











}
