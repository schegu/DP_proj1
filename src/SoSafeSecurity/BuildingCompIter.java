package SoSafeSecurity;
import java.util.Iterator;
import java.util.Stack;
import java.util.NoSuchElementException;

public class BuildingCompIter implements Iterator<BuildingComponent> {
	Stack<Iterator<BuildingComponent>> stack;
	
	public BuildingCompIter(Iterator<BuildingComponent> iterator) {
		stack = new Stack<Iterator<BuildingComponent>> ();
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty())
			return false;
		
		Iterator<BuildingComponent> iter = stack.peek();
		if (iter.hasNext())
			return true;
		
		stack.pop();
		return hasNext();
	}

	@Override
	public BuildingComponent next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		
		Iterator<BuildingComponent> iter = stack.peek();
		BuildingComponent bc = iter.next();
		if (bc.iterator().hasNext()){
		//	System.out.println("Adding"+bc.getLocation());
			stack.push(bc.iterator());
		}
		return bc;
	}
}

class NullIter implements Iterator<BuildingComponent>{

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public BuildingComponent next() {
		return null;
	}
}

