package gpj.singleton;

/**
 * ˫�ؼ��ģʽ
 * @author gpj
 *
 */
public class Singleton3 {
	//1.�����췽��˽�л�
	private Singleton3(){}
	
	//2.�������Ψһʵ��
	private static Singleton3 instance;
	
	//3.�ṩһ�����ڻ�ȡʵ���ķ���
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
