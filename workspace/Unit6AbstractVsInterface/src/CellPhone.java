
public class CellPhone extends ElectronicEquipments implements GameUnit, Telephone {

	@Override
	double powerConsumptionCalculator(double watt, double current) {
		// TODO Auto-generated method stub
		return (watt*current);
	}

	@Override
	public boolean isFun() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConvenience() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String calculateSignalStength() {
		// TODO Auto-generated method stub
		return "HIGH";
	}

}
