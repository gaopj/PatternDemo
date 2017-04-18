package gpj.singletonCrack;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��η�ֹ�����л�©��
 * ����ģʽ 
 * ����ģʽ
 * ���ʼ��ʱ���������ض����޷���ʱ���أ��������ʱ���߳��ǰ�ȫ�ģ�
 * @author gpj
 *
 */
public class Singleton2 implements Serializable{


	//1.�����췽��˽�л�
	private Singleton2(){
//		if(instance!=null){
//			throw new RuntimeException();
//		}
	}
	
	//2.�������Ψһʵ��
	private static Singleton2 instance = new Singleton2();
	
	//3.�ṩһ�����ڻ�ȡʵ���ķ���
	public static Singleton2 getInstance() {
		return instance;
	}
	
	//�����л�ʱ�����������readResolve()��ֱ�ӵ��ø÷������ض��󡣲����ٴ����¶���//���ڻص�
//	private Object readResolve() throws ObjectStreamException{
//		return instance;
//	}
}
