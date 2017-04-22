package gpj.myProxy;
public class $Proxy0 implements Moveable{
	private Moveable m;
	public $Proxy0(Moveable m) {
		super();
		this.m = m;
	}

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
