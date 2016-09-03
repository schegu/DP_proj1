package SoSafeSecurity;

import SensorObserver.*;

public class TheftSensor extends Sensor{
	private int cost = 20;
	
	public TheftSensor() {
		register();
		sensorstate = new Enable();
		notifyObserver(new StateEvent(this));
	}
	
	@Override
	public void register() {
		ob = TheftObserver.instance();
	}
	
	public int getCost(Service ser) {
		if (ser.getHold() == this.getClass())
			return cost;
		
		else 
			return 0;
	}
}
