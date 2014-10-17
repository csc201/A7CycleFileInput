import java.math.BigDecimal;


public abstract class PayCalculator {
	BigDecimal payRate;
	
	PayCalculator(BigDecimal payRate) {
		this.payRate = payRate;
	}
	
	abstract BigDecimal computePay(double hour);
	
	//deductRate is percentage
	BigDecimal computeDeduction(double deductRate) {
		return (this.payRate.multiply(new BigDecimal(deductRate)));
	}
}
