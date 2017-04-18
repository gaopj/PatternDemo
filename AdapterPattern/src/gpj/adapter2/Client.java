package gpj.adapter2;



/**
 * ¿Í»§¶ËÀà
 * @author gpj
 *
 */
public class Client {

	public void test1(Target t){
		t.handleReq();
	}
	public static void main(String[] args) {
		Client c =new Client();
		Adaptee adaptee= new Adaptee();
		Target t = new Adapter();
		c.test1(t);
	    t = new Adapter2(adaptee);
		c.test1(t);
		
	}

}
