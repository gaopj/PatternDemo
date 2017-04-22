package gpj.observer.weather;
/**
 * 具体目标对象，负责把有关状态存入到相应的观察者对象中
 * @author gpj
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {

	//获取天气的内容信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//通知所有订阅了天气的观察者
		this.notifyObservers();
	}

}
