package SoSafeSecurity;

public abstract class Sensor extends BuildingComponent 
{
	private String location;
	public type Type; 
	public enum type {
		FireSensor, TheftSensor;
	}
	
		public String getLocation(){
			return location;
	}
	
	public void add(BuildingComponent bc){
		throw new UnsupportedOperationException();
	}
	
	public void setLocation(String name){
		this.location = name;
	}

	public void getchildren(){
		throw new UnsupportedOperationException();
	}
	
	public BuildingComponent getindex(int index){
		throw new UnsupportedOperationException();
	}

}
