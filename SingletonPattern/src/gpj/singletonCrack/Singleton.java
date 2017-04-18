package gpj.singletonCrack;

/**
 * ��η�ֹ����©��
 * ����ģʽ 
 * ����ģʽ
 * ���ʼ��ʱ���������ض����޷���ʱ���أ��������ʱ���߳��ǰ�ȫ�ģ�
 * @author gpj
 *
 */
public class Singleton {


	//1.�����췽��˽�л�
	private Singleton(){
//		if(instance!=null){
//			throw new RuntimeException();
//		}
	}
	
	//2.�������Ψһʵ��
	private static Singleton instance = new Singleton();
	
	//3.�ṩһ�����ڻ�ȡʵ���ķ���
	public static Singleton getInstance() {
		return instance;
	}
}
