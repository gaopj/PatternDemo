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
			System.out.println("汽车开始行使。。。");
			m.invoke(target);
			long endTime = System.currentTimeMillis();
			System.out.println("汽车结束行使。。。 汽车行使时间："
					+(endTime-startTime)+"毫秒");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
