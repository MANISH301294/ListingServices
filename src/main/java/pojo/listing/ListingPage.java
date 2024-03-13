package pojo.listing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListingPage {

    public String total;
    public Facets facets;
    public Config config;
    public ArrayList<Result> results;
    public SelectedFilters selectedFilters;
    public String selectedSort;
    public MetaContent metaContent;
    public boolean personalised;
    public DynamicContent dynamicContent;

}