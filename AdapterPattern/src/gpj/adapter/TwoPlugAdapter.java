package gpj.adapter;
/**
 * ����ת����Ĳ���������
 * ������ϵķ�ʽ����������Ϊ����������
 * �ѡ��������ߡ���Ϊһ��������ϵ����������У����޸�Ŀ��ӿڰ�װ��������
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
		System.out.println("ͨ��ת��");
		plug.powerWithTwo();
	}

}
