package SoSafeSecurity;

public interface SensorState {
	public boolean detectEvent();
	public boolean stateChange();
	
}

class Enable implements SensorState {
	String color = "Green";

	@Override
	public boolean detectEvent() {
		return true;
	}

	@Override
	public boolean stateChange() {
		return true;
	}
}

class Malfunction implements SensorState {
	String color = "Red";
	
	@Override
	public boolean detectEvent() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean stateChange() {
		// TODO Auto-generated method stub
		return false;
	}
}

class Inactive implements SensorState {
	String color = "Blue";

	@Override
	public boolean detectEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stateChange() {
		// TODO Auto-generated method stub
		return false;
	}
}

class Disable implements SensorState {

	@Override
	public boolean detectEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stateChange() {
		// TODO Auto-generated method stub
		return true;
	}
}
