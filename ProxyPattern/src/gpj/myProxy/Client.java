package gpj.myProxy;


public class Client {
/**
 * ≤‚ ‘¿‡
 * @throws Exception 
 */
	public static void main(String[] args) throws Exception{
		 
		Car car = new Car();
		InvocationHandler handler  = new TimeHandler(car);

		 Moveable moveable=(Moveable) Proxy.newProxyInstance(Moveable.class,handler);
		 moveable.move();
	}
}
