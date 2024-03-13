package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Specifications {

    private String title;
    private String key;
    private int status;
    private String value;
    private ArrayList<Child> child;
}
