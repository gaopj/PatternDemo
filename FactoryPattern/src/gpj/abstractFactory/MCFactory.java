package gpj.abstractFactory;

/**
 * 圣诞系列加工厂
 * @author gpj
 *
 */
public class MCFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		return new MCBoy();
	}

	@Override
	public Girl getGirl() {
		return new MCGirl();
	}

}
