package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter@JsonIgnoreProperties(ignoreUnknown = true)
public class MainImage {

    private String path;
    private String label;
}
