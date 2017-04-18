package gpj.singletonCrack;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 如何防止反序列化漏洞
 * 单例模式 
 * 饿汉模式
 * 类初始化时，立即加载对象（无法延时加载）。类加载时，线程是安全的；
 * @author gpj
 *
 */
public class Singleton2 implements Serializable{


	//1.将构造方法私有化
	private Singleton2(){
//		if(instance!=null){
//			throw new RuntimeException();
//		}
	}
	
	//2.创建类的唯一实例
	private static Singleton2 instance = new Singleton2();
	
	//3.提供一个用于获取实例的方法
	public static Singleton2 getInstance() {
		return instance;
	}
	
	//反序列化时，如果定义了readResolve()，直接调用该方法返回对象。不会再创建新对象//基于回调
//	private Object readResolve() throws ObjectStreamException{
//		return instance;
//	}
}
