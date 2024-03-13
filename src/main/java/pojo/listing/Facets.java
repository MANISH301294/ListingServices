package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facets {

    private BodyType bodyType;
    private OdometerReading odometerReading;
    private ImperfectionCount imperfectionCount;
    private Year year;
    private DriveType driveType;
    private KbbDiff kbbDiff;
    private Seats seats;
    private QuotedPrice quotedPrice;
    private Features features;
    private AncapRating ancapRating;
    private FuelType fuelType;
    private ComingSoon comingSoon;
    private TransmissionType transmissionType;
    private Make make;
    private ColorCategory colorCategory;
    private MakeCityName makeCityName;
    private Promotion promotion;
}
