package SoSafeSecurity;

import java.util.Iterator;

public abstract class BuildingComponent {
	public abstract String getLocation();
	public abstract void add(BuildingComponent bc);
	public abstract void setLocation(String name);
	public abstract BuildingComponent getindex(int index);
	public abstract Iterator<BuildingComponent> iterator();
	public abstract int getCost(Service ser);
	public abstract void enableSensor();
	public abstract void disableSensor();
	final String delim = "/";
	String location;
}  
