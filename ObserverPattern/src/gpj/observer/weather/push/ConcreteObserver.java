package gpj.observer.weather.push;
/**
 * 具体的观察者对象，实现更新方法，使自身的状态和目标的状态保持一致
 * @author gpj
 *
 */
public class ConcreteObserver implements Observer {

	//观察者名字
	private String observerName; 
	//天气内容，这个消息从目标处获取
	private String weatherContent;
	
	private String remindThing;
	
	
	public String getObserverName() {
		return observerName;
	}


	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}


	public String getWeatherContent() {
		return weatherContent;
	}


	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}


	public String getRemindThing() {
		return remindThing;
	}


	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}


	/**
	 * 获取目标类状态同步到观察者状态
	 */
	@Override
	public void update(String content) {
		weatherContent =content;
		System.out.println(observerName+"收到了:"+weatherContent+","+remindThing);
	}

}
