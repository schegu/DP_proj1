package SoSafeSecurity;

public class Client {
	public static void main(String[] args) {
		Building a = new Building();
		for ( int i = 0; i < 4; i++){
			a.add(new Subsection());
			Subsection b = (Subsection) a.getindex(i);
			for(int j = 0; j < 2; j++){
				b.add(new Room());
			}
			for(int k = 0; k < 2; k++) {
				((Room)b.getindex(0)).add(new FireSensor());
				((Room)b.getindex(1)).add(new TheftSensor());
			}
		}
		a.getchildren();
		
	}
}
