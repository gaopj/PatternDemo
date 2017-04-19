package gpj.adapter2;
/**
 * 适配器
 * @author gpj
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void handleReq() {
		System.out.print("使用继承：  ");
		super.request();
	}

}
