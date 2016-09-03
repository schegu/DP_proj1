package SoSafeSecurity;

import java.util.Iterator;

public class Subsection extends Building{
	final private String cname = "Room";

	public void add(BuildingComponent bc){
		bc.setLocation(location+delim+cname+String.valueOf(list.size()+1));
		list.add(bc);
	}

	public void setLocation(String name){
		location = name;
	}
	
	public boolean hasService(Service service){
		Iterator<BuildingComponent> iter = iterator();
	
		//All rooms in a subsection have same type of sensor involved.
		Room temp = (Room) iter.next();
		return temp.hasService(service);	
	}
	
 }
