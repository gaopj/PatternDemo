package gpj.adapter;
/**
 * ���ü̳з�ʽ�Ĳ�����������Ϊ��������
 * ͨ�����ؼ̳в����ݽӿڣ�ʵ�ֶ�Ŀ��ӿڵ�ƥ�䣬��һΪĳ�����ʵ������
 * @author gpj
 *
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlug {

	@Override
	public void powerWithThree() {
		System.out.print("�����̳�������  ");
		this.powerWithTwo();
	}

}
