package gpj.myProxy;
public class $Proxy0 implements Moveable{
	public $Proxy0(gpj.myProxy.Moveable m) {
		super();
		this.m = m;
	}
	private Moveablem m;
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
