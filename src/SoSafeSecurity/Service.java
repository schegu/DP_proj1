package SoSafeSecurity;

import java.util.List;

public abstract class Service {
	Building build;
	Class hold;
	
	public List<BuildingComponent> getServiceLayout(){
		return build.getService(this);
	}
	
	public int getCost(){
		return build.getCost(this);
	}
	
	public Class getHold() {
		return hold;
	}
}

