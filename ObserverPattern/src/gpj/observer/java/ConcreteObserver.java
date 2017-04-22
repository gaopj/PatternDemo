package gpj.observer.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	//观察者名称变量
	private String observerContent;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getObserverContent() {
		return observerContent;
	}
	public void setObserverContent(String observerContent) {
		this.observerContent = observerContent;
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		//第一种推的方式
		System.out.println(name +"收到消息，目标推送过来的是："+arg1);
		
		//第二种拉的方式
		System.out.println(name +"收到消息，主动到目标对象中去拉："+((ConcreteSubject)arg0).getContent());
	}

}
