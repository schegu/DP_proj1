package SoSafeSecurity;

public class StateFactory {
     public SensorState createState(String state){
    	 if (state.equals("enable"))
    		 return new Enable();
    	 else if (state.equals("disable"))
    		 return new Disable();
    	 else if (state.equals("inactive"))
    		 return new Inactive();
    	 else if (state.equals("malfunction"))
    		 return new Malfunction();
    	 return null;
     }
}
