package SoSafeSecurity;

public abstract class SensorFactory {
	public static Sensor CreateSensor(String Sensortype){
		Sensor sensor = null;
		try {
			Class<?> claz = Class.forName("SoSafeSecurity."+Sensortype);
			sensor = (Sensor)claz.newInstance();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return sensor;
	}
}
