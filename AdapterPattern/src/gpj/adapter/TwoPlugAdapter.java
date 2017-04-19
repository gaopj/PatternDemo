package gpj.adapter;
/**
 * 二相转三相的插座适配器
 * 采用组合的方式的适配器成为对象适配器
 * 把“被适配者”作为一个对象组合到适配器类中，以修改目标接口包装被适配者
 * @author gpj
 *
 */
public class TwoPlugAdapter implements ThreePlug {

	private GBTwoPlug plug;
	
	public  TwoPlugAdapter(GBTwoPlug plug) {
		this.plug=plug;
	}
	@Override
	public void powerWithThree() {
		System.out.println("通过转换");
		plug.powerWithTwo();
	}

}
