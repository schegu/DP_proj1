package SensorObserver;


public class FireObserver extends Observer implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static FireObserver inst = new FireObserver();
	protected FireObserver(){
		
	}
	
	static public FireObserver instance() {
		return inst;
	}
	
	private Object readResolve(){
		return inst;
	}

	@Override
	public void visit(StateEvent acceptor) {
		System.out.println("State of Firesensor changed");
		
	}

	@Override
	public void visit(DetectionEvent acceptor) {
		System.out.println("Firesensor Detected event");
		
	}

	@Override
	public void update(Object arg) {
		((Acceptor) arg).accept(this);		
	}
	
}