package Client;
import java.util.Iterator;
import java.util.List;

import SoSafeSecurity.*;

public class Client {
	public static void main(String[] args) {
		Building a = new Building();
		Subsection b = null;
		StateFactory ff = new StateFactory();
	
		for ( int i = 0; i < 4; i++){
			a.add(new Subsection());
			b = (Subsection) a.getindex(i);
			for(int j = 0; j < 2; j++){
				b.add(new Room());
			}
			for(int k = 0; k < 2; k++) {
				//FireSensor f = new FireSensor();
				Sensor fs = SensorFactory.CreateSensor("FireSensor");
				Sensor ts = SensorFactory.CreateSensor("TheftSensor");
				fs.getLocation();
				((Room)b.getindex(0)).add(fs);
				((Room)b.getindex(k)).add(ts);
				fs.stateChange(ff.createState("disable"));
				fs.event();
			}
			
		}
					
		Iterator<BuildingComponent> iter = new BuildingCompIter(a.iterator());
		while (iter.hasNext()) {
			BuildingComponent temp = (BuildingComponent) iter.next();
			System.out.println(temp.getLocation());
		}
		
		
		
		Service ser = new FireService(a);
		Service ser1 = new TheftService(a);
		List<BuildingComponent> s = ser.getServiceLayout();
		iter = s.iterator();
		while (iter.hasNext()) 
			System.out.println(iter.next().getLocation() +"    Fire");
		
		s = ser1.getServiceLayout();
		iter = s.iterator();
		while (iter.hasNext())
			System.out.println(iter.next().getLocation() + "   theft");
		
		System.out.println(a.getCost(ser));
		System.out.println(a.getCost(ser1));
		
		SensorSetting ss = new SensorSetting(a);
		SensorOn son = new SensorOn(ss);
		SensorOff sof = new SensorOff(ss);
		Invoker in = new Invoker(son,sof);
		in.selectOn();
		in.selectOff();
	}
	
}
