package gpj.observer.java;

import java.util.Observable;

public class ConcreteSubject extends Observable {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;

		//通知所有观察者，java中setChanged()不可少
		this.setChanged();
		
		//推的方式
		this.notifyObservers(content);	
		
		//拉的方式
		//this.notifyObservers();
	}
}
