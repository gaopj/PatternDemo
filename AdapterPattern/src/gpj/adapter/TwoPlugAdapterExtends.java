package gpj.adapter;
/**
 * 采用继承方式的插座适配器称为类适配器
 * 通过多重继承不兼容接口，实现对目标接口的匹配，单一为某个类儿实现适配
 * @author gpj
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlug {

	@Override
	public void powerWithThree() {
		System.out.print("借助继承适配器  ");
		this.powerWithTwo();
	}

}
