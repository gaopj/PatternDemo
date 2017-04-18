package gpj.adapter2;
/**
 * ÊÊÅäÆ÷
 * @author gpj
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void handleReq() {
		System.out.print("Ê¹ÓÃ¼Ì³Ğ£º  ");
		super.request();
	}

}
