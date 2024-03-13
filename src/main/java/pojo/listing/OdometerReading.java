package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OdometerReading {

    private String name;
    private String type;
    private String displayName;
    private boolean mainFilter;
    private String filterType;
    private boolean enabledForSeo;
    private double min;
    private double max;
    private double stepRate;
}
