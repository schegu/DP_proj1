package SoSafeSecurity;

public class TheftService extends Service{
	
	public TheftService(Building build){
		this.build = build;
		this.hold = TheftSensor.class;

	}
	

}