package gpj.proxy;


public class Client {
/**
 * 测试类
 */
	public static void main(String[] args)
	{
//		Car car = new Car();
//		car.move();
		//使用继承方法（不推荐）
//		Moveable moveable = new Car2();
//		moveable.move();
		
		//使用聚合方法
		//先日志后时间
//		Car car = new Car();
//		CarTimeProxy carTimeProxy = new CarTimeProxy(car);
//		CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
//		carLogProxy.move();
		
		//先时间后日志
		Car car = new Car();
		CarLogProxy carLogProxy = new CarLogProxy(car);
		CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
		carTimeProxy.move();
		
	}
}
