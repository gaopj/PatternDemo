package gpj.abstractFactory;

/**
 * �����ʵ�ֽӿ�
 * @author gpj
 *
 */
public interface PersonFactory {

	//�к��ӿ�
	public Boy getBoy();
	
	//Ů���ӿ�
	public Girl getGirl();
}
