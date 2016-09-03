package SoSafeSecurity;

public class FireService extends Service{
	
	public FireService(Building build){
		this.build = build;
		this.hold = FireSensor.class;

	}

}

