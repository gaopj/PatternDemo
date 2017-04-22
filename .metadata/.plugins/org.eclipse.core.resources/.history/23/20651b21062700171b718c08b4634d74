package gpj.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册和删除观察者的接口
 * @author gpj
 *
 */
public class Subject {
	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<>();
	public void attach(Observer observer){
		observers.add(observer);
	}
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	protected void notifyObservers(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
