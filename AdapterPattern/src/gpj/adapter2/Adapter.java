package gpj.adapter2;
/**
 * ������
 * @author gpj
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void handleReq() {
		System.out.print("ʹ�ü̳У�  ");
		super.request();
	}

}
