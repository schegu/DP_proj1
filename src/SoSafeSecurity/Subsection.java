package SoSafeSecurity;

import java.util.ArrayList;
import java.util.Iterator;

public class Subsection extends BuildingComponent{
	private String location;
	ArrayList<BuildingComponent> list;

	public Subsection(){
		this.list = new ArrayList<BuildingComponent>();	
	}
	
	public String getLocation(){
		return location;
	}
	
	public void add(BuildingComponent bc){
		bc.setLocation(this.location+"/"+"Room"+String.valueOf(list.size()+1));
		list.add(bc);
	}

	public void setLocation(String name){
		this.location = name;
	}
	
	public void getchildren(){
		Iterator<BuildingComponent> iter = list.iterator();
		while (iter.hasNext()) {
			BuildingComponent temp = (BuildingComponent) iter.next();
			System.out.println(temp.getLocation());
			temp.getchildren();
		}
	}
		
	public BuildingComponent getindex(int index){
		  return list.get(index);
		}
 }
