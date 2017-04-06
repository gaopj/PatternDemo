package gpj.myProxy;
public class $Proxy0 implements gpj.myProxy.Moveable{
	public $Proxy0(gpj.myProxy.Moveable m) {
		super();
		this.m = m;
	}
	private gpj.myProxy.Moveablem;
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
