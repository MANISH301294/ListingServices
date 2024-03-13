package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Exterior360Images {

    private String id;
    private String spinTitle;
    private String iconSource;
    private int frames;
    private int index;
    private int initialFrame;
    private List<String> imageSource;
    private String hotspots;
    private ArrayList<HotspotImages> hotspotImages;
    private ArrayList<HotspotPostionData> hotspotPostionData;





}
