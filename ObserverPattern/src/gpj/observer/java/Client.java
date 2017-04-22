package gpj.observer.java;

public class Client {
	public static void main(String[] args)
	{
		//创建被观察者
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建观察者
		ConcreteObserver observer = new ConcreteObserver();
		observer.setName("鸡仔一号");
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setName("鸡仔二号");
		
		//注册观察者
		subject.addObserver(observer);
		subject.addObserver(observer2);
		
		//更新内容
		subject.setContent("鸡仔越来越厉害了");
		
		
		
	}
}
