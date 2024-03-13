package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

private String title;
private String desc;
private String descKey;
private ArrayList<Specification> specification;
private ArrayList<SpecificationHistory> specificationHistory;
}
