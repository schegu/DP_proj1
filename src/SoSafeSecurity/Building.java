package SoSafeSecurity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Building extends BuildingComponent 
{
	ArrayList<BuildingComponent> list;
	final private String cname = "Subsection";
	
	public Building(){
		list = new ArrayList<BuildingComponent>();
		location = "Building";
	}
	
	public String getLocation(){
		return location;
	}
	
	public void add(BuildingComponent bc){
	    bc.setLocation(location+delim+cname+String.valueOf(list.size()+1));
		list.add(bc);
	}
	
	public void setLocation(String name){
		location = name;
	}
	
	public BuildingComponent getindex(int index){
		  return list.get(index);
	}
	
	public Iterator<BuildingComponent> iterator() {
		return list.iterator();
	}
	
	public List<BuildingComponent> getService(Service service) {
		List<BuildingComponent> temp = new ArrayList();
		Iterator<BuildingComponent> iter = iterator();
		
		while (iter.hasNext()){
			Subsection sub = (Subsection) iter.next();
			if (sub.hasService(service))
				temp.add(sub);
		}
		
		return temp;
		
	}
	
	public int getCost(Service ser) {
		Iterator<BuildingComponent> iter = iterator();
		int cost = 0;
		
		while (iter.hasNext()) {
			BuildingComponent temp = (BuildingComponent) iter.next();
			cost = cost + temp.getCost(ser);
		}
		
		return cost;
	}
	
	public void enableSensor() {
		Iterator<BuildingComponent> iter = iterator();
		while (iter.hasNext()) {
			BuildingComponent temp = (BuildingComponent) iter.next();
			temp.enableSensor();
	}
 }
	
	public void disableSensor() {
		Iterator<BuildingComponent> iter = iterator();
		while (iter.hasNext()) {
			BuildingComponent temp = (BuildingComponent) iter.next();
			temp.disableSensor();
	}
 }
}
