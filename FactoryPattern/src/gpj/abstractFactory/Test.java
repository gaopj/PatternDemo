package gpj.abstractFactory;

/**
 * ģ��ͻ���ʵ��
 * 
 * @author gpj
 *
 */
public class Test {

	public static void main(String[] args) {

//		PersonFactory factory =new MCFactory();
//		Boy boy= factory.getBoy();
//		boy.drawMan();
		
		PersonFactory factory =new HNFactory();
		Girl girl= factory.getGirl();
		girl.drawWoman();
	}
	

}