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
		System.out.println("������ʼ��ʹ������");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("����������ʹ������ ������ʹʱ�䣺"
				+(endTime-startTime)+"����");
	}
}
