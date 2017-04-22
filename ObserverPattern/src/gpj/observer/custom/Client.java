package gpj.observer.custom;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject =new ConcreteSubject();
		
		ConcreteObserver observer1 =new ConcreteObserver(); 
		observer1.setObserverName("鸡仔一号");
		observer1.setRemindThing("贼牛逼");
		
		ConcreteObserver observer2 =new ConcreteObserver(); 
		observer2.setObserverName("鸡仔二号");
		observer2.setRemindThing("超牛逼");
		
		subject.attach(observer1);
		subject.attach(observer2);
		
		subject.setContent("情况1");
		subject.setContent("情况2");
		subject.setContent("情况3");

	}

}
