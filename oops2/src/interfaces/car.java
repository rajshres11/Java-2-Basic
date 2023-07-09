package interfaces;

public class car extends Vehicle implements Vehicleinterface,carinterface {
    @Override
	public boolean ismotorized() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getcompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numgears() {
		// TODO Auto-generated method stub
		return 5;
	}
}
