package gpj.proxy;

/**
 * 
 * @author gpj
 * 聚合方式实现代理
 */
public class CarLogProxy implements Moveable {
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}


	private Moveable m;
	
	
	@Override
	public void move() {
		System.out.println("日志开始。。。");
		m.move();
		System.out.println("日志结束。。。");
	}

}
