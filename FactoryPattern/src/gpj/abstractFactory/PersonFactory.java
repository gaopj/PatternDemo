package gpj.abstractFactory;

/**
 * 人物的实现接口
 * @author gpj
 *
 */
public interface PersonFactory {

	//男孩接口
	public Boy getBoy();
	
	//女孩接口
	public Girl getGirl();
}
