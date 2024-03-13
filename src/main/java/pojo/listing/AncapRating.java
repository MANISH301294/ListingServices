package pojo.listing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AncapRating {

    public String name;
    public String type;
    public String displayName;
    public boolean mainFilter;
    public String filterType;
    public boolean enabledForSeo;
    public ArrayList<Bucket> buckets;
    public int min;
    public int max;
    public int stepRate;
}
