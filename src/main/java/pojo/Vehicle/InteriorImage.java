package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class InteriorImage {

    private String label;
    private String path;
    private ArrayList<AdditionalInfo> additionalInfo;



}
