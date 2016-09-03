package SoSafeSecurity;

interface Command {
	public void execute();
}

public class SensorOn implements Command {
	
	private SensorSetting sensor;
		
		public SensorOn(SensorSetting sensor) {
			this.sensor = sensor;
		}
		
		public void execute(){
			sensor.setOn();
		}
}




