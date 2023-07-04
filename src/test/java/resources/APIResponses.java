package resources;

public enum APIResponses {

    getLisitngAPI("/v1/vehicle");


    String resources;
    APIResponses(String resources)
    {
        this.resources = resources;
    }

    public String getResources()
    {
        return resources;
    }


}
