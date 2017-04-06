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
	 * 參數：
	 * proxy:被代理对象
	 * method:被代理方法
	 * args: 方法参数
	 * 
	 * 返回值：
	 * Object 方法返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使。。。");
		
		method.invoke(target);
		
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使。。。 汽车行使时间："
				+(endTime-startTime)+"毫秒");
		return null;
	}

}
