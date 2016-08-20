package SoSafeSecurity;

public abstract class BuildingComponent {
	public abstract String getLocation();
	public abstract void add(BuildingComponent bc);
	public abstract void setLocation(String name);
	public abstract void getchildren();
	public abstract BuildingComponent getindex(int index);
}  
 
