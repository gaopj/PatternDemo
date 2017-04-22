package gpj.responsibilityChain;

public class Sales3 extends PriceHandler {

	/**
	 * 可以批准40%以内折扣
	 */
	@Override
	public void processDiscount(float discount) {

		if(discount<=0.4){
			System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
		}else {
			System.out.format("%s拒绝了折扣：%.2f%n", this.getClass().getName(),discount);
		}
	}

}
