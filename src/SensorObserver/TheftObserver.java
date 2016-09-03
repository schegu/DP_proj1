package SensorObserver;

public class TheftObserver extends Observer implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static TheftObserver inst = new TheftObserver();

	protected TheftObserver(){
		
	}
	
	static public TheftObserver instance(){
		return inst;
	}
	
	private Object readResolve(){
		return inst;
	}
	
	@Override
	public void update(Object arg) {
		((Acceptor) arg).accept(this);
		
	}

	@Override
	public void visit(StateEvent acceptor) {
		System.out.println("State of Theftsensor changed");
		
	}

	@Override
	public void visit(DetectionEvent acceptor) {
		System.out.println("Theftsensor Detected event");
		
	}
	
}
