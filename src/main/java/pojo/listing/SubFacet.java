package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubFacet {

    public String name;
    public String type;
    public boolean mainFilter;
    public String filterType;
    public boolean enabledForSeo;
    public ArrayList<Bucket> buckets;
}
