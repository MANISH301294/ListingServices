package pojo.Vehicle;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.Map;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleDetailResult<T> {

    private Details detail;
    private Config config;
    private boolean personalised;
    private String ipDetectedState;
    private boolean eligibleForExtendedWarranty;
    private String oldTimerBanner;
    @JsonIgnore
    private Map<String, Object> detailMap;
}