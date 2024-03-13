package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaContent {

    private Object title;
    private Object description;
    private Params params;
    private Object cityInfo;
    private Object specialPageType;
}
