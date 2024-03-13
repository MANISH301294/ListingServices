package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmiDetails {

    private double emi;
    private double interestRate;
    private double balloonPercentage;
    private int defaultDownPayment;
    private double lenderFee;
    private double comparisonRate;
    private double emiPerWeek;
    private double maxDownPayment;
    private double lenderMonthlyFee;
    private int minDownPayment;
    private int tenure;
}
