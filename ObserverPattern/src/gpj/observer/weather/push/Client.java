package gpj.observer.weather.push;

public class Client {

	public static void main(String[] args) {
		System.out.println("推模型");
		//1创建目标
		ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();
		
		//2创建观察者
		ConcreteObserver observerjizai  = new ConcreteObserver();
		observerjizai.setObserverName("鸡仔");
		observerjizai.setRemindThing("鸡仔厉害！");
		
		ConcreteObserver observerjizai2  = new ConcreteObserver();
		observerjizai2.setObserverName("鸡仔2");
		observerjizai2.setRemindThing("鸡仔2厉害！");
		
		//3注册观察者
		weatherSubject.attach(observerjizai);
		weatherSubject.attach(observerjizai2);
		
		//4目标处发布天气
		weatherSubject.setWeatherContent("明天天气不错");
		
		weatherSubject.setWeatherContent("后天天气一般");
	}

}
