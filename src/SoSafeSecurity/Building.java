package SoSafeSecurity;

import java.util.ArrayList;
import java.util.Iterator;

public class Building extends BuildingComponent 
{
	private String location;
	ArrayList<BuildingComponent> list;

	public Building(){
		this.list = new ArrayList<BuildingComponent>();
		this.location = "Building";
	}
	
	public String getLocation(){
		return location;
	}
	
	public void add(BuildingComponent bc){
	    bc.setLocation(this.location+"/"+"Subsection"+String.valueOf(list.size()+1));
		list.add(bc);
	}
	
	public void getchildren(){
		Iterator<BuildingComponent> iter = list.iterator();
		while (iter.hasNext()) {
			BuildingComponent temp = (BuildingComponent) iter.next();
			System.out.println(temp.getLocation());
			temp.getchildren();
		}
	}
	
	public void setLocation(String name){
		
	}
	
	public BuildingComponent getindex(int index){
		  return list.get(index);
	}
		
}

