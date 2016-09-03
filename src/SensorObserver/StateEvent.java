package SensorObserver;

import SensorObserver.Acceptor;
import SoSafeSecurity.Sensor;


public class StateEvent implements Acceptor {

	Sensor sensor;
	
	public StateEvent(Sensor sensor) {
		this.sensor = sensor;
	}
	
	@Override
	public void accept(EventVisitor visitor) {
		visitor.visit(this);
		
	}
	
}