package SoSafeSecurity;

public class SensorOff implements Command {
	private SensorSetting sensor;
	
	public SensorOff(SensorSetting sensor) {
		this.sensor = sensor;
	}
	
	public void execute(){
		sensor.setOff();
	}
}

