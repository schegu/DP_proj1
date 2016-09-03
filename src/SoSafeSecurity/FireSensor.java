package SoSafeSecurity;
import SensorObserver.*;

public class FireSensor extends Sensor{
	private int cost = 10;
	
	public FireSensor() {
		register();
		sensorstate = new Enable();
		notifyObserver(new StateEvent(this));
	}
	
	@Override
	public void register() {
		ob = FireObserver.instance();
	}
	
	public int getCost(Service ser) {
		if (ser.getHold() == this.getClass())
			return cost;
		
		else 
			return 0;
	}

}
