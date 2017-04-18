package gpj.singleton;

/**
 * 双重检测模式
 * @author gpj
 *
 */
public class Singleton3 {
	//1.将构造方法私有化
	private Singleton3(){}
	
	//2.创建类的唯一实例
	private static Singleton3 instance;
	
	//3.提供一个用于获取实例的方法
	public static Singleton3 getInstance() {
		if(instance==null){
			Singleton3 s;
			synchronized (Singleton3.class) {
				s=instance;
				if(s==null){
					synchronized(Singleton3.class){
						if(s==null){
							s= new Singleton3();
						}
					}
					instance=s;
				}
			}
		}
		return instance;
	}
}
