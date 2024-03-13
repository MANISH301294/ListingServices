package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.eo.Se;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriveType {

    private String name;
    private String type;
    private String displayName;
    private boolean mainFilter;
    private String filterType;
    private boolean enabledForSeo;
    private ArrayList<Bucket> buckets;
}
