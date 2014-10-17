
public class ThreePhrasesAc extends ElectronicEquipments {
	@Override
	double powerConsumptionCalculator(double watt, double current) {
		// TODO Auto-generated method stub
		return (Math.sqrt(3)*watt*current);
	}
}
