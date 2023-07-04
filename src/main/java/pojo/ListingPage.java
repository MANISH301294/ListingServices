package pojo;

public class ListingPage {

    private int total;
    private facets facets;
    private String config;
    private String results;
    private String selectedFilters;
    private String selectedSort;
    private String metaContent;
    private String personalised;



    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public facets getFacets() {
        return facets;
    }

    public void setFacets(facets facets) {
        this.facets = facets;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getSelectedFilters() {
        return selectedFilters;
    }

    public void setSelectedFilters(String selectedFilters) {
        this.selectedFilters = selectedFilters;
    }

    public String getSelectedSort() {
        return selectedSort;
    }

    public void setSelectedSort(String selectedSort) {
        this.selectedSort = selectedSort;
    }

    public String getMetaContent() {
        return metaContent;
    }

    public void setMetaContent(String metaContent) {
        this.metaContent = metaContent;
    }

    public String getPersonalised() {
        return personalised;
    }

    public void setPersonalised(String personalised) {
        this.personalised = personalised;
    }


}
