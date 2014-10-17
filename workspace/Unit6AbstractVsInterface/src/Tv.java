
public class Tv extends ElectronicEquipments implements GameUnit, SmartTelephone{
	public double powerConsumptionCalculator(double watt, double current) {
		return(watt*current);
	}

	@Override
	public boolean isFun() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isConvenience() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String calculateSignalStength() {
		// TODO Auto-generated method stub
		return "LOW";
	}

	@Override
	public boolean getVisualImage() {
		// TODO Auto-generated method stub
		return true;
	}
}
