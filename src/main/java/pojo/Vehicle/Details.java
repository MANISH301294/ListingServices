package pojo.Vehicle;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.eo.Do;
import lombok.Getter;
import lombok.Setter;
import pojo.listing.EmiDetails;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {


    private String appointmentId;
    private String year;
    private String modelYear;
    private double egc;
    private double tradeInAmount;
    private Boolean personalised;
    private EmiDetail emiDetails;
    private String cityCode;
    private String stateCode;
    private String state;
    private String make;
    private String model;
    private String variant;
    private String transmissionType;
    private String color;
    private String fuelType;
    private String  bodyType;
    private Boolean booked;
    private Boolean listingActive;
    private String  city;
    private String  driveType;
    private String  shareUrl;
    private Boolean  turbochargerSuperchargerAvailable;
    private MainImage mainImage;
    private String  threeSixtyViewUrl;
    private Boolean  threeSixtyViewAvailable;
    private String  mediaSource;
    private Boolean  comingSoon;
    private String  promotion;
    private String  vin;
    private int  kbbAskingPrice;
    private int  kbbAskingPriceRangeMin;
    private int  kbbAskingPriceRangeMax;
    private String  kbbValueProvidedOn;
    private String  engineNo;
    private String  complianceDate;
    private double  kerbWeight;
    private double  gst;
    private int  category;
    private Boolean  oldTimer;
    private ArrayList<ExteriorImage> exteriorImages;
    private ArrayList<InteriorImage> interiorImages;
    private ArrayList<Interior360Image> interior360Images;
    private ArrayList<Exterior360Images> exterior360Images;
    private ArrayList<GalleryV2> galleryV2;
    private ArrayList<ImperfectionImages> imperfectionImages;
    private ArrayList<Highlights> highlights;
    private ArrayList<Features> features;
    private ArrayList<Specifications> specifications;
    private ArrayList<Summary> summary;
    private String ppsrReportLink;
    private ArrayList<ServiceHistory> serviceHistory;
    private String serviceHistoryText;
    private Boolean reserved;
    private Boolean displayTestDriveFlow;
    private String wearAndTearGuideLink;
    private Boolean displayBrakeSafetySection;
    private PremiumFeatures premiumFeatures;
    private Boolean dapPriceEnabled;
    private ArrayList<SimilarModelCars> similarModelCars;
    private ArrayList<SimilarModelCars> similarBudgetCars;
    private ArrayList<MoreCars> moreCars;
    private ArrayList<BuyWithConfidence> buyWithConfidence;
    private double price;
    private int odometerReading;






}
