package pojo.listing;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DynamicContent {

    public Object make;
    public Object model;
    public String metaTitleTag;
    public String metaDescription;
    public String h1;
    public String h1B;
    public Object h2;
    public Object h2B;
    public Object h1Body;
    public Object h2Body;
}
