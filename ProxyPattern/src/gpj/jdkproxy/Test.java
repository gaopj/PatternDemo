package gpj.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import gpj.proxy.Car;
import gpj.proxy.Moveable;

public class Test {
/**
 * JDK动态代理测试
 */
	public static void main(String[] args)
	{
		Car car = new Car();
		InvocationHandler handler =new TimeHandler(car);
		Class<?> class1 = car.getClass();
		/**
		 * loader 被代理类类加载器
		 * interfaces 实现接口
		 * h InvocationHandler
		 * 
		 * 动态代理实现思路
		 * 实现功能：通过Proxy的newProxyInstance方法返回代理对象
		 * 1.声明一段源码（动态生成代理类）
		 * 2、编译源码（JDK Compiler API）,产生新的类（代理类）
		 * 3、将这个类load到内存中，产生新的对象（代理对象）
		 * 4、return 代理对象
		 */
		 Moveable moveable= (Moveable)Proxy.newProxyInstance(class1.getClassLoader(), 
				class1.getInterfaces(), handler);
		 System.out.println("代理"+moveable.getClass().getName());
		 moveable.move();
	}
}
