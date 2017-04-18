package gpj.singleton;
/**
 * 懒汉模式
 * @author gpj
 *
 */
public class SingletonLazy {
	//1.将构造方法私有化
	private  SingletonLazy() {}

	//2.初始化时，不初始化这个对象（延时加载，真正用的时候再创建）
	private static SingletonLazy instance ;
	
	//3.提供一个用于获取实例的方法
//	public static SingletonLazy getInstance() {
//		if(instance==null)
//		{
//			instance = new SingletonLazy();
//		}
//		return instance;
//	}
	
	//方法同步，调用效率低
	public static synchronized SingletonLazy getInstance() {
		if(instance==null)
		{
			instance = new SingletonLazy();
		}
		return instance;
	}
}
