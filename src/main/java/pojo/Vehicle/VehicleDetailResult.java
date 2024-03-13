package pojo.Vehicle;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.Map;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDetailResult<T> {

    private Details detail;
    private Map<String,String> config;
    private boolean personalised;
    private String ipDetectedState;
    private boolean eligibleForExtendedWarranty;
    private String oldTimerBanner;
    @JsonIgnore
    private Map<String, Object> detailMap;
}