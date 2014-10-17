
public abstract class ElectronicEquipments {
	int voltage;
	
	abstract double powerConsumptionCalculator(double watt, double current);
	
	double powerConsumptionCost(double watt, double hour) {
		return (watt*hour);
	}
}
