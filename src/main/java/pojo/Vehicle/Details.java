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
    private Double egc;
    private Double tradeInAmount;
    private Boolean personalised;
    private EmiDetail emiDetails;
    private Boolean cityCode;
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
    private Double  kerbWeight;
    private Double  gst;
    private int  category;
    private Boolean  oldTimer;
    private ArrayList<ExteriorImage> exteriorImages;
    private ArrayList<InteriorImage> interiorImages;
    private ArrayList<GalleryV2> galleryV2;
    private ArrayList<ImperfectionImages> imperfectionImages;
    private ArrayList<Highlights> highlights;





}
