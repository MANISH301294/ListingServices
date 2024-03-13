package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotspot {

    private String id;
    private double pitch;
    private double yaw;
    private String hotspotRefId;
    private String customKey;
    private TriggerFrame triggerFrame;
    private String imageTitle;
    private String description;
    private String type;
    private String imageSrc;
}
