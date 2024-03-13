package resources;

public enum VehicleAPIResponses {

    getVehicleAPI("/v1/vehicle/");


    String resources;

    VehicleAPIResponses(String resources) {
        this.resources = resources;
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public String getResources(String id) {
        return resources+id;
    }
}
