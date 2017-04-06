package gpj.proxy;

/**
 * 
 * @author gpj
 * 聚合方式实现代理
 */
public class CarTimeProxy implements Moveable {
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}


	private Moveable m;
	
	
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使。。。");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使。。。 汽车行使时间："
				+(endTime-startTime)+"毫秒");
	}

}
