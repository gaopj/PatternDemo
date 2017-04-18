package gpj.singletonCrack;

/**
 * 如何防止反射漏洞
 * 单例模式 
 * 饿汉模式
 * 类初始化时，立即加载对象（无法延时加载）。类加载时，线程是安全的；
 * @author gpj
 *
 */
public class Singleton {


	//1.将构造方法私有化
	private Singleton(){
//		if(instance!=null){
//			throw new RuntimeException();
//		}
	}
	
	//2.创建类的唯一实例
	private static Singleton instance = new Singleton();
	
	//3.提供一个用于获取实例的方法
	public static Singleton getInstance() {
		return instance;
	}
}
