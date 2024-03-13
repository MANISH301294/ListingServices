package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotspotPostionData {
    private String id;
    private int frameId;
    private double x;
    private double y;
    private String hotspotRefId;
    private String customKey;
    private int triggerFrame;
    private String type;
    private String imageTitle;
    private String description;
    private String imageSrc;
    private List<String> display;
    private List<String> location;




}
