package SensorObserver;

import SoSafeSecurity.Sensor;

public class DetectionEvent implements Acceptor {
	Sensor sensor;
	
	public DetectionEvent(Sensor sensor) {
		this.sensor = sensor;
	}
	
	@Override
	public void accept(EventVisitor visitor) {
		visitor.visit(this);
		
	}
}