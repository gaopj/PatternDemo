package gpj.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	private Object target;
	/**
	 * ������
	 * proxy:���������
	 * method:��������
	 * args: ��������
	 * 
	 * ����ֵ��
	 * Object ��������ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʹ������");
		
		method.invoke(target);
		
		long endTime = System.currentTimeMillis();
		System.out.println("����������ʹ������ ������ʹʱ�䣺"
				+(endTime-startTime)+"����");
		return null;
	}

}
