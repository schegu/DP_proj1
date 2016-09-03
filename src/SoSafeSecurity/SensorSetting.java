package SoSafeSecurity;

public class SensorSetting {
	Building build;
	
	public SensorSetting(Building build) {
		this.build = build;
	}
	
	public void setOn() {
		build.enableSensor();
	}
	
	public void setOff() {
		build.disableSensor();
	}
}






