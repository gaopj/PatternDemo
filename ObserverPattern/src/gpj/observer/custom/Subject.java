package gpj.observer.custom;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	public List<Observer> observers = new ArrayList<>();
		
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	protected abstract void notifyObservers();
	
}
