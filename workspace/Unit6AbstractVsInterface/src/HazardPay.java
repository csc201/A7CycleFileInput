import java.math.BigDecimal;


public class HazardPay extends PayCalculator {

	HazardPay(BigDecimal payRate) {
		super(payRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	BigDecimal computePay(double hour) {
		// TODO Auto-generated method stub
		return payRate.multiply(new BigDecimal(hour)).multiply(new BigDecimal(1.5));
	}

}
