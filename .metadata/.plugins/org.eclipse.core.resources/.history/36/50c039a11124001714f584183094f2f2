package gpj.singleton;

/**
 * 静态内部类
 * 兼备了并发高效调用和延迟加载的优势
 * @author gpj
 *
 */
public class Singleton4 {

	private static class Singleton4Holder {
		private static final Singleton4 instance = new Singleton4();
	}
	
	private Singleton4(){}
	
	public static Singleton4 getInstance() {
		return Singleton4Holder.instance;
	}
}
