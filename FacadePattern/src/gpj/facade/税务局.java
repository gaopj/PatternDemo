package gpj.facade;

public interface 税务局 {
	void texCertificate(); //核名
}

class 海淀税务局 implements 税务局{

	@Override
	public void texCertificate() {
		System.out.println("办理税务登记证！");
		
	}
	
}
