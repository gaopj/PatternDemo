package gpj.responsibilityChain;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandler.createPriceHandler());
		
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(i+":");
			customer.requestDiscount((random.nextFloat()*0.5f));
		}

	}
	

}