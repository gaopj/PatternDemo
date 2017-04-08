package gpj.abstractFactory;

/**
 * ����ϵ�мӹ���
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