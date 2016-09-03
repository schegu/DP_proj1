package SoSafeSecurity;
import java.util.Iterator;

import SensorObserver.DetectionEvent;
import SensorObserver.Observer;
import SensorObserver.StateEvent;

interface Subject {
	public void register();
	public void unRegister();
	public void notifyObserver(Object arg);
}

public abstract class Sensor extends Building implements Subject
{
	SensorState sensorstate;
	Observer ob;
	
	public void add(BuildingComponent bc){
		throw new UnsupportedOperationException();
	}
	
	public BuildingComponent getindex(int index){
		throw new UnsupportedOperationException();
	}
	
	public Iterator<BuildingComponent> iterator() {
		return new NullIter();
	}
	
	public void stateChange(SensorState newState) {
		if (sensorstate.stateChange()) {
			sensorstate = newState;
			notifyObserver(new StateEvent(this));
			
			if (sensorstate.detectEvent() || sensorstate.stateChange())
				register();
			else
				unRegister();
			
		}
	}
	
	public void event(){
		if (sensorstate.detectEvent())
			notifyObserver(new DetectionEvent(this));
	}
	
	public void unRegister() {
		ob = null;
		
	}

	public void notifyObserver(Object arg) {
			ob.update(arg);
		
	}
	
	public void enableSensor() {
		stateChange(new Enable());
	}
	
	public void disableSensor() {
		stateChange(new Disable());
	}
}

