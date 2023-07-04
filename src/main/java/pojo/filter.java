package pojo;

import java.util.List;

public class filter {

    private String name;
    private FacetType type;
    private Boolean selected;
    private String  displayName;
    private boolean mainFilter;
    private String filterType;
    private Object suggestions;
    private Integer priority;
    private Boolean enabledForSeo;
    private String groupName;
    private FacetType facetType;
    private int min;
    private int max;
    private int stepRate;
    private int limit;
    private List<RangeFacet> range;
    private Order order;
    private List<Bucket> buckets;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FacetType getType() {
        return type;
    }

    public void setType(FacetType type) {
        this.type = type;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isMainFilter() {
        return mainFilter;
    }

    public void setMainFilter(boolean mainFilter) {
        this.mainFilter = mainFilter;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public Object getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(Object suggestions) {
        this.suggestions = suggestions;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getEnabledForSeo() {
        return enabledForSeo;
    }

    public void setEnabledForSeo(Boolean enabledForSeo) {
        this.enabledForSeo = enabledForSeo;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public FacetType getFacetType() {
        return facetType;
    }

    public void setFacetType(FacetType facetType) {
        this.facetType = facetType;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStepRate() {
        return stepRate;
    }

    public void setStepRate(int stepRate) {
        this.stepRate = stepRate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<RangeFacet> getRange() {
        return range;
    }

    public void setRange(List<RangeFacet> range) {
        this.range = range;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Bucket> getBucket() {
        return buckets;
    }

    public void setBucket(List<Bucket> buckets) {
        this.buckets = buckets;
    }


}
