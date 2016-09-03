package SensorObserver;

interface EventVisitor {
	public void visit(StateEvent acceptor);
	public void visit(DetectionEvent acceptor);
}

interface Acceptor {
	public void accept(EventVisitor visitor);
}



public abstract class Observer implements EventVisitor{
/*	protected ArrayList<Sensor> subject;*/
	public abstract void update(Object arg);	
}



