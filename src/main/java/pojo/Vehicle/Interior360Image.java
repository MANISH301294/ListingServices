package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interior360Image {
    private String id;
    private String spinTitle;
    private String interior360Type;
    private String iconSource;
    private String hotspots;
    private List<String> imageSource;
    private List<Hotspot> hotspotPostionData;
    private List<HotspotImage> hotspotImages;
}
