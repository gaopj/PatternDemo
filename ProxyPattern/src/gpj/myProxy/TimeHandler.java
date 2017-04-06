package gpj.myProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	private Object target;
	
	@Override
	public void invoke(Object o, Method m) {
	
		try {
			long startTime = System.currentTimeMillis();
			System.out.println("������ʼ��ʹ������");
			m.invoke(target);
			long endTime = System.currentTimeMillis();
			System.out.println("����������ʹ������ ������ʹʱ�䣺"
					+(endTime-startTime)+"����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
