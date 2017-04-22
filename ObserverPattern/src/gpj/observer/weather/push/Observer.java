package gpj.observer.weather.push;
/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @author gpj
 *
 */
public interface Observer {
	/**
	 * 观察者更新的接口
	 * @param content 传入的目标对象的部分，按需订制
	 */
	void update(String content);
}
