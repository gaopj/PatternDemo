package gpj.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import gpj.proxy.Car;
import gpj.proxy.Moveable;

public class Test {
/**
 * JDK��̬�������
 */
	public static void main(String[] args)
	{
		Car car = new Car();
		InvocationHandler handler =new TimeHandler(car);
		Class<?> class1 = car.getClass();
		/**
		 * loader ���������������
		 * interfaces ʵ�ֽӿ�
		 * h InvocationHandler
		 * 
		 * ��̬����ʵ��˼·
		 * ʵ�ֹ��ܣ�ͨ��Proxy��newProxyInstance�������ش������
		 * 1.����һ��Դ�루��̬���ɴ����ࣩ
		 * 2������Դ�루JDK Compiler API��,�����µ��ࣨ�����ࣩ
		 * 3���������load���ڴ��У������µĶ��󣨴������
		 * 4��return �������
		 */
		 Moveable moveable= (Moveable)Proxy.newProxyInstance(class1.getClassLoader(), 
				class1.getInterfaces(), handler);
		 System.out.println("����"+moveable.getClass().getName());
		 moveable.move();
	}
}
