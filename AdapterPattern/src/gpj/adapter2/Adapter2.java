package gpj.adapter2;
/**
 * 适配器
 * @author gpj
 *
 */
public class Adapter2 implements Target {

	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee)
	{
		this.adaptee = adaptee;
	}
	@Override
	public void handleReq() {
		System.out.print("使用组合：  ");
		adaptee.request();
	}

}
