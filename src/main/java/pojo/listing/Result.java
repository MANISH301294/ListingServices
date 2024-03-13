package pojo.listing;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    private String appointmentId;
    private String year;
    private double egc;
    private double estimatedPrice;
    private Object tradeInAmount;
    private boolean personalised;
    private EmiDetails emiDetails;
    private Object expressDelivery;
    private String cityCode;
    private String stateCode;
    private String state;
    private String make;
    private String model;
    private String variant;
    private Object trim;
    private Object specs;
    private Object engineSize;
    private String driveType;
    private Object noOfCylinders;
    private boolean turbochargerSuperchargerAvailable;
    private boolean booked;
    private boolean listingActive;
    private String city;
    private String promotion;
    private String vin;
    private int kbbAskingPrice;
    private int kbbAskingPriceRangeMin;
    private int kbbAskingPriceRangeMax;
    private String kbbValueProvidedOn;
    private String threeSixtyViewUrl;
    private boolean threeSixtyViewAvailable;
    private String mediaSource;
    private double kerbWeight;
    private MainImage mainImage;
    private double gst;
    private String body;
    private boolean comingSoon;
    private boolean reserved;
    private boolean dapPriceEnabled;
    private Object offer;
    private Object exteriorImages;
    private Object interiorImages;
    private Object imperfectionImages;
    private Object vehicleFeatures;
    private Object vehicleSpecifications;
    private Object dapPrice;
    private Object inspectionObject;
    private double price;
    private int odometerReading;
    private Object ownerNumber;
    private String transmissionType;
    private String fuelType;
    private String seats;
}
