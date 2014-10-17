import java.math.BigDecimal;


public class RegularPay extends PayCalculator {
	
	public RegularPay(BigDecimal payRate) {
		super(payRate);
	}
	
	@Override
	BigDecimal computePay(double hour) {
		// TODO Auto-generated method stub
		return payRate.multiply(new BigDecimal(hour));
	}

}
