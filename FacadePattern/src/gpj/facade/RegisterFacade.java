package gpj.facade;
/**
 * 办理注册公司的门面对象
 * @author gpj
 *
 */
public class RegisterFacade {

	void rigester()
	{
		工商局  a = new 海淀工商局();
		a.checkName();
		
		税务局  b = new 海淀税务局();
		b.texCertificate();
		
		银行  c = new 工商银行();
		c.openAccount();
	}
}
