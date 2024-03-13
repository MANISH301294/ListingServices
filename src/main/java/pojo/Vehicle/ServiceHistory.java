package pojo.Vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceHistory {
    private String serviceDate;
    private String status;
    private String serviceCenterAddress;
    private String preService;
    private PostService postService;

}
