package pojo.listing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FuelType {

    private String name;
    private String type;
    private String displayName;
    private boolean mainFilter;
    private String filterType;
    private boolean enabledForSeo;
    private ArrayList<Bucket> buckets;
}
