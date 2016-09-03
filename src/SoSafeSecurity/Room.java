package SoSafeSecurity;

import java.util.Iterator;

public class Room extends Building {
	final private String cname = "Sensor";
	
	public void add(BuildingComponent bc){
		bc.setLocation(location+delim+cname+String.valueOf(list.size()+1));
		list.add(bc);
	}
	
	public boolean hasService(Service serv){
		Iterator<BuildingComponent> iter = iterator();
		
		
		while (iter.hasNext()) {
			Sensor temp = (Sensor) iter.next();
			if (temp.getClass() == serv.getHold() )
				return true;
		}
		
		return false;
	}
}
