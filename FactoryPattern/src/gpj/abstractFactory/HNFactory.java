package gpj.abstractFactory;

/**
 * 新年系列加工厂
 * @author gpj
 *
 */
public class HNFactory implements PersonFactory{

	@Override
	public Boy getBoy() {
		
		return new HNBoy();
	}

	@Override
	public Girl getGirl() {
	
		return new HNGirl();
	}

}
