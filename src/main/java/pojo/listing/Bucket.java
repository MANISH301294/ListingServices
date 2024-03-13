package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bucket {

    private String name;
    private int count;
    private SubFacet subFacet;
    private double from;
    @JsonProperty("to")
    private double myto;

}