package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoreCars {
    private String title;
    private String image;
    private String availableCars;
    private String seoPath;
    private Filter filter;
}
